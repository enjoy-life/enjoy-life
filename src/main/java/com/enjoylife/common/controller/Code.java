package com.enjoylife.common.controller;

/**
 * Created with IntelliJ IDEA.
 * Author: liangjun.zhong
 * Date: 14-8-27
 * Time: AM1:15
 * To change this template use File | Settings | File Templates.
 */
public enum Code {

    SUCCESS(200),       // 成功
    UN_AUTHORIZED(401), // 未经授权
    ILLEGAL_PARAM(402), // 非法参数
    ERROR(500)          // 服务出错
    ;

    public final int value;

    private Code(int value) {
        this.value = value;
    }


}
