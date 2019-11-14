package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class TestController {
    @Autowired
    private FileInfoService fileInfoService;

    @GetMapping("/test")
    public String downloadPage(Model model, @RequestParam(defaultValue = "1") String pageNum, Search search) {

        return "test";
    }
}
