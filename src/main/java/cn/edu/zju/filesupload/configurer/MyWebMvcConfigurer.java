package cn.edu.zju.filesupload.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    public static final String MY_SESSION_USER_KEY = "user";
    /**
     * 配置静态目录
     * spring2.x 后无法直接访问到 /static 目录下的文件
     * @param registry registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
        registry.addResourceHandler("/files/**").addResourceLocations("file:/E:/Program_Data/upload/");
    }

    @Bean
    public SecurityInterceptor getSecurityInterceptor() {
        return new SecurityInterceptor();
    }

    public void addInterceptors(InterceptorRegistry registry) {
        InterceptorRegistration addInterceptor = registry.addInterceptor(getSecurityInterceptor());
//        addInterceptor.excludePathPatterns("/error");
        addInterceptor.excludePathPatterns("/user/login");
        addInterceptor.excludePathPatterns("/css/**");
        addInterceptor.excludePathPatterns("/js/**");
        addInterceptor.excludePathPatterns("/images/**");
        addInterceptor.excludePathPatterns("/fonts/**");
        addInterceptor.addPathPatterns("/**");
    }

    private class SecurityInterceptor extends HandlerInterceptorAdapter {
        @Override
        public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
            HttpSession session = request.getSession();
            if (session != null && session.getAttribute(MY_SESSION_USER_KEY) != null) {
                return true;
            }
            String url = "/user/login";
//            request.getRequestDispatcher(url).forward(request, response);
            response.sendRedirect(url);
            return false;
        }
    }

}
