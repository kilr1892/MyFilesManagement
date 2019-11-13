package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.service.FileInfoService;
import cn.edu.zju.filesupload.utils.ResponseInfo;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Controller
public class FileInfoController {

    @Autowired
    private FileInfoService fileInfoService;

    @GetMapping("/upload")
    public String uploadPage(Model model) {
        return "upload";
    }

    @PostMapping("/upload")
    @ResponseBody
    public ResponseInfo<?> upload(@RequestParam("file") MultipartFile[] files, FileInfo fileInfo) {
        if (StringUtils.isEmpty(fileInfo.getFileCreatedByName())) {
            return ResponseInfo.error("请输入上传人姓名");
        }
        if (files[0].isEmpty()) {
            return ResponseInfo.error("请选择文件");
        }
        return fileInfoService.upload(files, fileInfo);
    }
}
