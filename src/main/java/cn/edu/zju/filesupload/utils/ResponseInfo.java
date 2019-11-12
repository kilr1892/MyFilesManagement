package cn.edu.zju.filesupload.utils;

import com.google.common.collect.ImmutableMap;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * 自定义响应体.
 *
 * @author RichardLee
 * @version v1.0
 */
@Data
@AllArgsConstructor
public class ResponseInfo<T> implements Serializable {
    private static final long serialVersionUID = 1894775364138623934L;
    public static final String KEY_CODE = "code";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_DATA = "data";
    public static final String CODE_SUCCESS = "0000";
    public static final String CODE_ERROR = "9999";
    public static final ImmutableMap<String, String> CODE_MAP = ImmutableMap.of(
            CODE_SUCCESS, "成功",
            CODE_ERROR, "系统异常，请稍后再试"
    );

    private String code;
    private String message;
    private T data;

    /**
     * 返回成功
     * @param data data
     * @param <T> T
     * @return ResponseInfo
     */
    public static <T> ResponseInfo<T> success(T data) {
        return new ResponseInfo<>(CODE_SUCCESS, CODE_MAP.get(CODE_SUCCESS), data);
    }

    /**
     * 返回失败
     * @param data data
     * @param <T> T
     * @return ResponseInfo
     */
    public static <T> ResponseInfo<T> error(T data) {
        return new ResponseInfo<>(CODE_ERROR, CODE_MAP.get(CODE_ERROR), data);
    }

    /**
     * 判断是否是成功的
     * @return boolean
     */
    public boolean isSuccess() {
        return CODE_SUCCESS.equals(code);
    }


}
