package cn.edu.zju.filesupload.mapper;

import cn.edu.zju.filesupload.pojo.FileUpload;
import cn.edu.zju.filesupload.pojo.FileUploadExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileUploadMapper {
    int countByExample(FileUploadExample example);

    int deleteByExample(FileUploadExample example);

    int deleteByPrimaryKey(String fileId);

    int insert(FileUpload record);

    int insertSelective(FileUpload record);

    List<FileUpload> selectByExample(FileUploadExample example);

    FileUpload selectByPrimaryKey(String fileId);

    int updateByExampleSelective(@Param("record") FileUpload record, @Param("example") FileUploadExample example);

    int updateByExample(@Param("record") FileUpload record, @Param("example") FileUploadExample example);

    int updateByPrimaryKeySelective(FileUpload record);

    int updateByPrimaryKey(FileUpload record);
}