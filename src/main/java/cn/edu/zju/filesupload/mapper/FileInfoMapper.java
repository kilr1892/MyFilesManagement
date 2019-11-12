package cn.edu.zju.filesupload.mapper;

import cn.edu.zju.filesupload.pojo.FileInfo;
import cn.edu.zju.filesupload.pojo.FileInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FileInfoMapper {
    int countByExample(FileInfoExample example);

    int deleteByExample(FileInfoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FileInfo record);

    int insertSelective(FileInfo record);

    List<FileInfo> selectByExample(FileInfoExample example);

    FileInfo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FileInfo record, @Param("example") FileInfoExample example);

    int updateByExample(@Param("record") FileInfo record, @Param("example") FileInfoExample example);

    int updateByPrimaryKeySelective(FileInfo record);

    int updateByPrimaryKey(FileInfo record);
}