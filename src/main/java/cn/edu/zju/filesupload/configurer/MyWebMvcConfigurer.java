package cn.edu.zju.filesupload.configurer;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {

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
}
