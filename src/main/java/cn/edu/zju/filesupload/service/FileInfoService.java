package cn.edu.zju.filesupload.service;

import cn.edu.zju.filesupload.exception.BusinessException;
import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.utils.ResponseInfo;
import com.github.pagehelper.PageInfo;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Date;

/**
 * 文件上传下载服务.
 *
 * @author RichardLee
 * @version v1.0
 */
public interface FileInfoService {

    ResponseInfo<?> upload(MultipartFile[] files, FileInfo fileInfo);

    PageInfo<FileInfo> listFileData(Integer pageNum, Integer pageSize, Search search);

    String getDateString(Date searchDate);

    void downloadFile(String fileName, HttpServletResponse res) throws BusinessException, UnsupportedEncodingException;

    ResponseInfo<?> toGrade(String fileId, String toGrade) throws BusinessException;
}
