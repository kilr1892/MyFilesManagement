package cn.edu.zju.filesupload.exception;

import cn.edu.zju.filesupload.utils.ResponseInfo;

/**
 * 自定义异常.
 *
 * @author RichardLee
 * @version v1.0
 */
public class BusinessException extends Exception {
    private static final long serialVersionUID = -4924602073581289125L;
    private String code;
    private String message;

    public BusinessException(String message) {
        this.message = message;
        this.code = ResponseInfo.CODE_ERROR;
    }

    public BusinessException(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public ResponseInfo<Object> getResponse() {
        return new ResponseInfo<>(code, message, null);
    }
}
