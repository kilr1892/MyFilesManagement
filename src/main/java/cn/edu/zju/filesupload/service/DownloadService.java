package cn.edu.zju.filesupload.service;

import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.pojo.Search;
import com.github.pagehelper.PageInfo;

import java.util.Date;

/**
 * DownloadService.
 *
 * @author RichardLee
 * @version v1.0
 */
public interface DownloadService {
    PageInfo<FileUpload> listFileData(Integer pageNum, Integer pageSize, Search search);


    String getDateString(Date searchDate);
}
