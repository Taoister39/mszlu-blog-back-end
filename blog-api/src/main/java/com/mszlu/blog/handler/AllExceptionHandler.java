package com.mszlu.blog.handler;

import com.mszlu.blog.vo.Result;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

// 统一异常处理，对加了@Controler装饰的方法进行拦截处理AOP实现
// 比如文章、标签controller
@ControllerAdvice
public class AllExceptionHandler {
    // 处理Exception.class的异常
    @ExceptionHandler(Exception.class)
    @ResponseBody // 返回json数据
    public Result doException(Exception exception) {
        // 先打印到堆栈
        exception.printStackTrace();
        return Result.fail(-999, "系统异常");
    }
}
