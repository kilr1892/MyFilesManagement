package cn.edu.zju.filesupload.service.impl;

import cn.edu.zju.filesupload.exception.BusinessException;
import cn.edu.zju.filesupload.mapper.FileInfoMapper;
import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.pojo.FileInfoExample;
import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.service.FileInfoService;
import cn.edu.zju.filesupload.utils.FileUtils;
import cn.edu.zju.filesupload.utils.ResponseInfo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 服务实现类.
 *
 * @author RichardLee
 * @version v1.0
 */
@Slf4j
@Service
public class FileInfoServiceImpl implements FileInfoService {

    @Autowired
    private FileInfoMapper fileInfoMapper;

    @Override
    @Transactional
    public ResponseInfo<?> upload(MultipartFile[] files, FileInfo fileInfo) {
        // TODO 以后可以改为配置文件里设置地址
        // 基础路径 E:/springboot-upload/image/
        String basePath = "E:/Program_Data/upload/";
        // 保存文件夹 \20180608\113339\
        String folder = FileUtils.getFolder();

        try {
            // 创建文件夹
            Path filePath = Files.createDirectories(Paths.get(basePath, folder));
            log.info("basePath + folder --> {}", filePath);

            for (MultipartFile file : files) {
                // 文件原始名
                fileInfo.setFileOriginalName(file.getOriginalFilename());

                // 文件名 eUljOejPseMeDg86h.png
                String fileName = FileUtils.getFileName(fileInfo);
                //写入文件  E:\springboot-upload\image\20180608\113339\eUljOejPseMeDg86h.png
                File dest = new File(basePath + folder + fileName);

                // 上传文件
                file.transferTo(dest);
                log.info(file.getOriginalFilename() + "上传成功");

                // 这里要把一些信息写入数据库
                // 创建日期 更新人 更新日期
                Date today = new Date();
                fileInfo.setFileCreatedDate(today);
                fileInfo.setFileUpdatedByName(fileInfo.getFileCreatedByName());
                fileInfo.setFileUpdatedDate(today);
                // 删除时间为空
                fileInfo.setFileDeleteTime("");
                // 文件随机名
                fileInfo.setFileName(fileName);

                // 文件存放地址 \20180608\113339\a.jpg
                fileInfo.setFilePath(basePath + folder);
                // 后缀
                fileInfo.setFileType(FileUtils.getFileNameSub(fileInfo.getFileOriginalName()));
                // 是否删除
                fileInfo.setFileIsDelete(false);
                // md5信息
                fileInfo.setFileMd5(FileUtils.md5File(dest.toString()));
                // 资源id 现在是资源评分哦
                // TODO 以后记得改字段...这里就觉得jpa真好
                fileInfo.setFileResourceId("0");
                // 大小
                fileInfo.setFileSize(file.getSize()/1024);
                // 可用
                fileInfo.setFileIsValid(true);
                // 保留字
                // FileReservedVarchar1 用作搜索用的时间吧
                String s = LocalDate.now().toString();
                fileInfo.setFileReservedVarchar1(s);
                fileInfo.setFileReservedVarchar2("");
                fileInfo.setFileReservedVarchar3("");

                // 插入数据库
                fileInfoMapper.insertSelective(fileInfo);
                log.info(file.getOriginalFilename() + "插入数据库成功");
            }

        } catch (IOException e) {
            Path path = Paths.get(basePath, folder);
            log.error("写入文件异常,删除本次上传文件", e);
            try {
                Files.deleteIfExists(path);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return ResponseInfo.error(e.getMessage());
        }

        return ResponseInfo.success("上传成功");
    }

    @Override
    public PageInfo<FileInfo> listFileData(Integer pageNum, Integer pageSize, Search searchPOJO) {
        PageHelper.startPage(pageNum, pageSize);
        FileInfoExample fileInfoExample = new FileInfoExample();
        FileInfoExample.Criteria criteria = fileInfoExample.createCriteria();

        if (searchPOJO.getSearchDate() != null) {
            Date searchDate = searchPOJO.getSearchDate();
//
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String format = df.format(searchDate);

            criteria.andFileReservedVarchar3EqualTo(format);
        }

        if ("".equals(searchPOJO.getSearchFileName()) || searchPOJO.getSearchFileName() == null) {
            ;
        } else {
            criteria.andFileNameLike("%" + searchPOJO.getSearchFileName() + "%");
        }

        fileInfoExample.setOrderByClause("file_id desc");
        List<FileInfo> fileInfos = fileInfoMapper.selectByExample(fileInfoExample);
        PageInfo<FileInfo> fileUploadPageInfo = new PageInfo<>(fileInfos, pageSize);
        return fileUploadPageInfo;
    }

    @Override
    public String getDateString(Date searchDate) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(searchDate);
        System.out.println(format);
        return format;
    }

    @Override
    public void downloadFile(String fileName, HttpServletResponse res) throws BusinessException, UnsupportedEncodingException {
        if (fileName == null) {
            throw new BusinessException("1001", "文件名不能为空");
        }

        FileInfoExample fileInfoExample = new FileInfoExample();
        FileInfoExample.Criteria criteria = fileInfoExample.createCriteria();
        criteria.andFileNameEqualTo(fileName);
        FileInfo fileInfo = fileInfoMapper.selectByExample(fileInfoExample).get(0);
        log.info("fileInfo-->{}", fileInfo);
        if (fileInfo == null) {
            throw new BusinessException("2001", "文件名不存在");
        }
        // 设置强制下载不打开
        res.setContentType("application/force-download");
        // 设置文件名
        res.addHeader("Content-Disposition", "attachment;fileName=" +
                new String(fileInfo.getFileOriginalName().getBytes("gbk"), "iso8859-1"));
        res.setHeader("Context-type", "application/octet-stream");

        // 找到文件
        File file = new File(Paths.get(fileInfo.getFilePath(), fileName).toString());
        if (file.exists()) {
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            OutputStream os = null;

            try {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                os = res.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
                log.info(fileInfo.getFileOriginalName() + "下载成功");
            } catch (Exception e) {
                e.printStackTrace();
                throw new BusinessException("9999", e.getMessage());
            } finally {
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
