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
public class MyConfigurer implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath*:/static/");
        registry.addResourceHandler("/files/**").addResourceLocations("file:/E:/Program_Data/upload/");
//        WebMvcConfigurer.super.addResourceHandlers(registry);
    }
}
