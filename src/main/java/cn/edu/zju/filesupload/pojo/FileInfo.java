package cn.edu.zju.filesupload.pojo;

import java.util.Date;

public class FileInfo {
    private Long id;

    private String createdBy;

    private Date createdDate;

    private String updatedBy;

    private Date updatedDate;

    private String deleteTime;

    private String fileName;

    private String fileOrginName;

    private String filePath;

    private String fileType;

    private Boolean isDelete;

    private String md5;

    private String resourceId;

    private Long size;

    private Boolean valid;

    private String fileReservedVarchar1;

    private String fileReservedVarchar2;

    private String fileReservedVarchar3;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(String deleteTime) {
        this.deleteTime = deleteTime == null ? null : deleteTime.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileOrginName() {
        return fileOrginName;
    }

    public void setFileOrginName(String fileOrginName) {
        this.fileOrginName = fileOrginName == null ? null : fileOrginName.trim();
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5 == null ? null : md5.trim();
    }

    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId == null ? null : resourceId.trim();
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
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