package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.service.DownloadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class IndexController {
    @Autowired
    private DownloadService downloadService;

    @GetMapping("/test")
    public String downloadPage(Model model) {
        return "test";
    }
}
