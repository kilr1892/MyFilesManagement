package cn.edu.zju.filesupload.pojo;

import java.util.Date;

public class FileUpload {
    private String fileId;

    private String fileName;

    private Date fileCreateDate;

    private String fileSize;

    private String fileOwner;

    private String fileGrade;

    private String fileType;

    private String fileLocation;

    private String fileReservedVarchar3;

    private String fileReservedVarchar4;

    private String fileReservedVarchar5;

    private String fileReservedVarchar6;

    private String fileReservedVarchar7;

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId == null ? null : fileId.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public Date getFileCreateDate() {
        return fileCreateDate;
    }

    public void setFileCreateDate(Date fileCreateDate) {
        this.fileCreateDate = fileCreateDate;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(String fileSize) {
        this.fileSize = fileSize == null ? null : fileSize.trim();
    }

    public String getFileOwner() {
        return fileOwner;
    }

    public void setFileOwner(String fileOwner) {
        this.fileOwner = fileOwner == null ? null : fileOwner.trim();
    }

    public String getFileGrade() {
        return fileGrade;
    }

    public void setFileGrade(String fileGrade) {
        this.fileGrade = fileGrade == null ? null : fileGrade.trim();
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType == null ? null : fileType.trim();
    }

    public String getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(String fileLocation) {
        this.fileLocation = fileLocation == null ? null : fileLocation.trim();
    }

    public String getFileReservedVarchar3() {
        return fileReservedVarchar3;
    }

    public void setFileReservedVarchar3(String fileReservedVarchar3) {
        this.fileReservedVarchar3 = fileReservedVarchar3 == null ? null : fileReservedVarchar3.trim();
    }

    public String getFileReservedVarchar4() {
        return fileReservedVarchar4;
    }

    public void setFileReservedVarchar4(String fileReservedVarchar4) {
        this.fileReservedVarchar4 = fileReservedVarchar4 == null ? null : fileReservedVarchar4.trim();
    }

    public String getFileReservedVarchar5() {
        return fileReservedVarchar5;
    }

    public void setFileReservedVarchar5(String fileReservedVarchar5) {
        this.fileReservedVarchar5 = fileReservedVarchar5 == null ? null : fileReservedVarchar5.trim();
    }

    public String getFileReservedVarchar6() {
        return fileReservedVarchar6;
    }

    public void setFileReservedVarchar6(String fileReservedVarchar6) {
        this.fileReservedVarchar6 = fileReservedVarchar6 == null ? null : fileReservedVarchar6.trim();
    }

    public String getFileReservedVarchar7() {
        return fileReservedVarchar7;
    }

    public void setFileReservedVarchar7(String fileReservedVarchar7) {
        this.fileReservedVarchar7 = fileReservedVarchar7 == null ? null : fileReservedVarchar7.trim();
    }
}