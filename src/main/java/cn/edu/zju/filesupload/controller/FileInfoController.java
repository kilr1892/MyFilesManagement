package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.exception.BusinessException;
import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.pojo.Search;
import cn.edu.zju.filesupload.service.FileInfoService;
import cn.edu.zju.filesupload.utils.ResponseInfo;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;


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

    /**
     * 上传
     *
     * @param files    前端上传的文件
     * @param fileInfo FileInfo
     * @return ResponseInfo json对象
     */
    @PostMapping("/upload")
//    @ResponseBody
    public String upload(@RequestParam("file") MultipartFile[] files, FileInfo fileInfo) {
        if (StringUtils.isEmpty(fileInfo.getFileCreatedByName())) {
            return "请输入上传人姓名";
        }
        if (files[0].isEmpty()) {
            return "请选择文件";
        }
        ResponseInfo<?> upload = fileInfoService.upload(files, fileInfo);
        if (upload.getCode().equals("0000")) {
            return "redirect:/download";
        } else {
            return "服务器错误";
        }

    }

    @GetMapping(value = {"/", "/download"})
    public String downloadPage(Model model, @RequestParam(defaultValue = "1") String pageNum, Search search) {
        PageInfo<FileInfo> listFileDataPageInfo = fileInfoService.listFileData(Integer.parseInt(pageNum), 5, search);
        if (search.getSearchDate() != null) {
            String date = fileInfoService.getDateString(search.getSearchDate());
            model.addAttribute("dateString", date);
        }
        model.addAttribute("listFileData", listFileDataPageInfo.getList());
        model.addAttribute("pageInfo", listFileDataPageInfo);
        model.addAttribute("searchPojo", search);
        return "download";
    }

    @GetMapping("/download/{fileName}")
    public void downloadFile(@PathVariable("fileName") String fileName, HttpServletResponse res) {
        try {
            fileInfoService.downloadFile(fileName, res);
        } catch (BusinessException e) {
            e.getResponse();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    @PostMapping("/toGrade")
    public String toGrade(Model model, Search search,String fileId, String toGrade) throws BusinessException {

        ResponseInfo<?> responseInfo = fileInfoService.toGrade(fileId, toGrade);

        return "redirect:/download?searchDate=" + fileInfoService.getDateString(search.getSearchDate()) + "&searchFileName=" + search.getSearchFileName();
    }
}
