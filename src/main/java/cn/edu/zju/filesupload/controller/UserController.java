package cn.edu.zju.filesupload.controller;

import cn.edu.zju.filesupload.configurer.MyWebMvcConfigurer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Controller
@RequestMapping("/user")
@Slf4j
public class UserController {
    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/login")
    public String login(String userName, String pwd, HttpSession session, Model model) {
        log.info(" username " + userName + " pwd " + pwd);
        if (!StringUtils.isEmpty(userName)) {
            userName = StringUtils.trimAllWhitespace(userName);
        }
        if (!StringUtils.isEmpty(pwd)) {
            pwd = StringUtils.trimAllWhitespace(pwd);
        }
        if ("admin".equals(userName) && "zju308".equals(pwd)) {
            session.setAttribute(MyWebMvcConfigurer.MY_SESSION_USER_KEY, userName);
            return "redirect:/";
        } else {
            // 错误
            model.addAttribute("loginError", "用户名或密码错误");
            return "login";
        }
    }
}
