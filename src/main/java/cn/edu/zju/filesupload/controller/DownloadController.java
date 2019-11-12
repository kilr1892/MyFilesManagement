package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.service.DownloadService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * DownloadController.
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
public class DownloadController {
    @Autowired
    private DownloadService downloadService;

    @GetMapping(value = {"/","/download"})
    public String downloadPage(Model model, @RequestParam(defaultValue = "1") String pageNum, Search search) {
        PageInfo<FileUpload> listFileDataPageInfo = downloadService.listFileData(Integer.parseInt(pageNum), 5, search);
        if (search.getSearchDate() != null) {
            String date = downloadService.getDateString(search.getSearchDate());
            model.addAttribute("dateString", date);
        }
        model.addAttribute("listFileData", listFileDataPageInfo.getList());
        model.addAttribute("pageInfo", listFileDataPageInfo);
        model.addAttribute("searchPojo", search);
        return "download";
    }
}
