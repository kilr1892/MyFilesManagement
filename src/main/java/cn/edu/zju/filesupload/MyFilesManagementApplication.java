package cn.edu.zju.filesupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("cn.edu.zju.filesupload.mapper")
public class MyFilesManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyFilesManagementApplication.class, args);
    }

}
