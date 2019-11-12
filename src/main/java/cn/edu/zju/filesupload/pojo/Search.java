package cn.edu.zju.filesupload.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Data
public class Search {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date searchDate;
    private String searchFileName;

}
