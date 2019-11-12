package cn.edu.zju.filesupload.service.impl;

import cn.edu.zju.filesupload.mapper.FileUploadMapper;
import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.service.UploadService;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.UUID;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class UploadServiceImpl implements UploadService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadServiceImpl.class);

    @Autowired
    private FileUploadMapper fileUploadMapper;

    @Override
    @Transactional
    public String upload(MultipartFile[] files, FileUpload fileUpload) {
        if (files[0].isEmpty()) {
            return "请选择文件";
        }

        // TODO 以后可以改为配置文件里设置地址
        // TODO 文件同名怎么办?
        // TODO 多目录存放文件
        String filePath = "E:\\Program_Data\\upload\\";
        File dir = new File(filePath);
        if (!dir.isDirectory()) {
            dir.mkdir();
        }

        for (MultipartFile file : files) {
            String fileName = file.getOriginalFilename();

            File dest = new File(filePath + fileName);

            // 这里要把一些信息写入数据库
            // 文件名
            fileUpload.setFileId(UUID.randomUUID().toString().replaceAll("-",""));
            fileUpload.setFileName(fileName.substring(0,fileName.lastIndexOf(".")));
            Date date = new Date();
            fileUpload.setFileCreateDate(date);
            fileUpload.setFileSize(file.getSize()+"");
            fileUpload.setFileGrade("0");
            fileUpload.setFileType(fileName.substring(fileName.lastIndexOf(".")));
            // 地址这一块还需要再考虑下
            fileUpload.setFileLocation(filePath + fileName);
            String s = LocalDate.now().toString();
            fileUpload.setFileReservedVarchar3(s);
            fileUpload.setFileReservedVarchar4("");
            fileUpload.setFileReservedVarchar5("");
            fileUpload.setFileReservedVarchar6("");
            fileUpload.setFileReservedVarchar7("");

            fileUploadMapper.insert(fileUpload);
            try {
                file.transferTo(dest);
                LOGGER.info(fileName + "上传成功");
            } catch (IOException e) {
                LOGGER.error(e.toString(), e);
                return fileName + "上传失败";
            }
        }
        return "上传成功";
    }
}
