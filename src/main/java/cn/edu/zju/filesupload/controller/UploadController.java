package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.service.UploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * upload controller.
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class UploadController {
    private static final Logger LOGGER = LoggerFactory.getLogger(UploadController.class);

    @Autowired
    private UploadService uploadService;

    @GetMapping("upload")
    public String uploadPage(Model model) {
        return "upload";
    }

    @PostMapping("upload")
    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile[] files, FileUpload fileUpload) {
        if (StringUtils.isEmpty(fileUpload.getFileOwner())) {
            return "请输入上传人姓名";
        }

        String upload = uploadService.upload(files, fileUpload);

        return upload;
    }
}
