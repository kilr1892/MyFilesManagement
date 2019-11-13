package cn.edu.zju.filesupload.pojo;

import java.util.Date;

public class FileInfo {
    private Integer fileId;

    private String fileCreatedByName;

    private Date fileCreatedDate;

    private String fileUpdatedByName;

    private Date fileUpdatedDate;

    private String fileDeleteTime;

    private String fileName;

    private String fileOriginalName;

    private String filePath;

    private String fileType;

    private Boolean fileIsDelete;

    private String fileMd5;

    private String fileResourceId;

    private Long fileSize;

    private Boolean fileIsValid;

    private String fileReservedVarchar1;

    private String fileReservedVarchar2;

    private String fileReservedVarchar3;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getFileCreatedByName() {
        return fileCreatedByName;
    }

    public void setFileCreatedByName(String fileCreatedByName) {
        this.fileCreatedByName = fileCreatedByName == null ? null : fileCreatedByName.trim();
    }

    public Date getFileCreatedDate() {
        return fileCreatedDate;
    }

    public void setFileCreatedDate(Date fileCreatedDate) {
        this.fileCreatedDate = fileCreatedDate;
    }

    public String getFileUpdatedByName() {
        return fileUpdatedByName;
    }

    public void setFileUpdatedByName(String fileUpdatedByName) {
        this.fileUpdatedByName = fileUpdatedByName == null ? null : fileUpdatedByName.trim();
    }

    public Date getFileUpdatedDate() {
        return fileUpdatedDate;
    }

    public void setFileUpdatedDate(Date fileUpdatedDate) {
        this.fileUpdatedDate = fileUpdatedDate;
    }

    public String getFileDeleteTime() {
        return fileDeleteTime;
    }

    public void setFileDeleteTime(String fileDeleteTime) {
        this.fileDeleteTime = fileDeleteTime == null ? null : fileDeleteTime.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileOriginalName() {
        return fileOriginalName;
    }

    public void setFileOriginalName(String fileOriginalName) {
        this.fileOriginalName = fileOriginalName == null ? null : fileOriginalName.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public Boolean getFileIsDelete() {
        return fileIsDelete;
    }

    public void setFileIsDelete(Boolean fileIsDelete) {
        this.fileIsDelete = fileIsDelete;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    public String getFileResourceId() {
        return fileResourceId;
    }

    public void setFileResourceId(String fileResourceId) {
        this.fileResourceId = fileResourceId == null ? null : fileResourceId.trim();
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Boolean getFileIsValid() {
        return fileIsValid;
    }

    public void setFileIsValid(Boolean fileIsValid) {
        this.fileIsValid = fileIsValid;
    }

    public String getFileReservedVarchar1() {
        return fileReservedVarchar1;
    }

    public void setFileReservedVarchar1(String fileReservedVarchar1) {
        this.fileReservedVarchar1 = fileReservedVarchar1 == null ? null : fileReservedVarchar1.trim();
    }

    public String getFileReservedVarchar2() {
        return fileReservedVarchar2;
    }

    public void setFileReservedVarchar2(String fileReservedVarchar2) {
        this.fileReservedVarchar2 = fileReservedVarchar2 == null ? null : fileReservedVarchar2.trim();
    }

    public String getFileReservedVarchar3() {
        return fileReservedVarchar3;
    }

    public void setFileReservedVarchar3(String fileReservedVarchar3) {
        this.fileReservedVarchar3 = fileReservedVarchar3 == null ? null : fileReservedVarchar3.trim();
    }
}