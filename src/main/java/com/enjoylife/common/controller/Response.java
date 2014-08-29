package com.enjoylife.common.controller;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-27
 * Time: AM1:02
 * To change this template use File | Settings | File Templates.
 */
public class Response<T> implements Serializable {
    private static final long serialVersionUID = -2826322576122867739L;

    private int code;
    private String msg;
    private T content;

    public final static Response DEFAULT_SUCCESS_RESPONSE = new Response(Code.SUCCESS, "操作成功！");
    public final static Response DEFAULT_ILLEGAL_PARAM_RESPONSE = new Response(Code.ILLEGAL_PARAM, "参数不合法！");
    public final static Response DEFAULT_UN_AUTHORIZED_RESPONSE = new Response(Code.UN_AUTHORIZED, "未经授权！");
    public final static Response DEFAULT_ERROR_RESPONSE = new Response(Code.ERROR, "服务出问题了！");

    public Response() {}

    public Response(Code code, String msg) {
        this.code = code.value;
        this.msg = msg;
    }

    public Response(Code code, String msg, T content) {
        this.code = code.value;
        this.msg = msg;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}
