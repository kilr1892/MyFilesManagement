package cn.edu.zju.filesupload.service;

import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.utils.ResponseInfo;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传下载服务.
 *
 * @author RichardLee
 * @version v1.0
 */
public interface FileInfoService {

    ResponseInfo<?> upload(MultipartFile[] files, FileInfo fileInfo);
}
