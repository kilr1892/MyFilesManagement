package cn.edu.zju.filesupload.service.impl;

import cn.edu.zju.filesupload.mapper.FileUploadMapper;
import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.pojo.FileUploadExample;
import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.service.DownloadService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Service
public class DownloadServiceImpl implements DownloadService {
    @Autowired
    private FileUploadMapper fileUploadMapper;

    @Override
    public PageInfo<FileUpload> listFileData(Integer pageNum, Integer pageSize, Search searchPOJO) {
        PageHelper.startPage(pageNum, pageSize);
        FileUploadExample fileUploadExample = new FileUploadExample();
        FileUploadExample.Criteria criteria = fileUploadExample.createCriteria();

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

        fileUploadExample.setOrderByClause("file_create_date desc");
        List<FileUpload> fileUploads = fileUploadMapper.selectByExample(fileUploadExample);
        PageInfo<FileUpload> fileUploadPageInfo = new PageInfo<>(fileUploads, pageSize);
        return fileUploadPageInfo;
    }

    @Override
    public String getDateString(Date searchDate) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String format = df.format(searchDate);
        System.out.println(format);
        return format;
    }
}
