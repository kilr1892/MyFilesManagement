package cn.edu.zju.filesupload.utils;

import cn.edu.zju.filesupload.pojo.FileInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Hex;

import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * .
 *
 * @author RichardLee
 * @version v1.0
 */
@Slf4j
public class FileUtils {

    public static String getFileSeparator() {
        return System.getProperty("file.separator");
    }

    public static String getFolder() {
        String dateStr = new SimpleDateFormat("yyyyMMdd").format(new Date());
        String timeStr = new SimpleDateFormat("HHmmss").format(new Date());
        return getFileSeparator() + dateStr + getFileSeparator() + timeStr + getFileSeparator();
    }

    public static String getFileNameSub(String fileOriginalName) {
        return fileOriginalName.substring(fileOriginalName.lastIndexOf("."));
    }

    public static String getFileName(FileInfo fileInfo) {
        return UUID.randomUUID().toString().replaceAll("-", "") + FileUtils.getFileNameSub(fileInfo.getFileOriginalName());
    }

    public static String md5File(String path) {
        String value = null;
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(path);
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] buffer = new byte[4096];
            int length;
            while ((length = fis.read(buffer, 0, 4096)) != -1) {
                md.update(buffer, 0, length);
            }
            value = Hex.encodeHexString(md.digest());
        } catch (IOException | NoSuchAlgorithmException e) {
            log.error("calc md5 failed", e);
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    log.error("资源关闭失败");
                }
            }
        }
        return value;
    }

}
