package com.mszlu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ErrorCode {
    PARAMS_ERROR(10001, "参数错误"),

    ACCOUNT_PWD_NOT_EXIST(10002,"用户名不存在或密码错误"),
    TOKEN_ERROR(10003,"token不合法"),
    ACCOUNT_EXIST(10004,"账号已存在"),
    NOT_LOGIN(90002,"未登录");

    private int code;
    private String msg;

//    ErrorCode(int code, String msg) {
//        this.code = code;
//        this.msg = msg;
//    }

//    public int getCode() {
//        return code;
//    }
//
//    public String getMsg() {
//        return msg;
//    }
}
