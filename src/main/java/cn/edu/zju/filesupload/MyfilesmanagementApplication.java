package cn.edu.zju.filesupload;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("cn.edu.zju.filesupload.mapper")
public class MyfilesmanagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyfilesmanagementApplication.class, args);
    }

}
