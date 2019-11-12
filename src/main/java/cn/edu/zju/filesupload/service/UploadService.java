package cn.edu.zju.filesupload.service;

import cn.edu.zju.filesupload.pojo.FileUpload;
import org.springframework.web.multipart.MultipartFile;

/**
 * UploadService.
 *
 * @author RichardLee
 * @version v1.0
 */
public interface UploadService {
    String upload(MultipartFile[] file, FileUpload fileUpload);
}
