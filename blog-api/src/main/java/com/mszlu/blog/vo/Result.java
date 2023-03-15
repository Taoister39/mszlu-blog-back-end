package com.mszlu.blog.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

// 统一的返回接口值
@Data
@AllArgsConstructor // 自动增加构造函数（所有参数）
public class Result<T> {
    private boolean success;
    private int code;
    private String msg;
    private T data;

    public static <T> Result success(T data) {
        return new Result(true, 200, "success", data);
    }

    public static Result fail(int code, String msg) {
        return new Result(false, code, msg, null);
    }
}
