package com.blyx.common.base;


import lombok.Data;

import java.io.Serializable;

/**
 * @description 对外rest接口返回包装类
 * @author quyang5
 * @date 2020.09.02
 *
 * */
@Data
public class BlyxResult<T> implements Serializable {
    /**
     * 成功状态
     */
    private boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应消息内容
     */
    private String msg;

    /**
     * 响应结果数据
     */
    private T data;
    /**
     * 成功状态
     */
    public static final int SUCCESS_CODE = 1;
    /**
     * 错误状态
     */
    public static final int ERROR_CODE = 0;

    /**
     * Constructs a new BlyxResult.
     */
    public BlyxResult() {
    }

    public BlyxResult(boolean success, int code, int errorCode, String Msg, T data) {
        this.success = success;
        this.code = code;
        this.msg = Msg;
        this.data = data;
    }


    /**
     * 设置失败错误信息
     *
     * @param message 错误内容信息
     */
    public void setFail(int code, String message) {
        this.success = false;
        this.code = code;
        this.msg = message;
    }

    public static  <T> BlyxResult<T> setFailure(int code, String message) {
        BlyxResult<T> result=new BlyxResult<>();
        result.setFail(code,message);
        return result;
    }


    public void setSucData(T data) {
        this.success = true;
        this.data = data;
        this.code = SUCCESS_CODE;
        this.msg="请求成功";
    }
    public static  <T> BlyxResult<T> setSuccessData(T data) {
        BlyxResult<T> result=new BlyxResult<>();
        result.setSucData(data);
        return result;
    }
}
