package com.opencode.springboot01.exception;

import com.opencode.springboot01.pojo.ResponseMessage;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice   // 统一处理异常数据
public class GlobalExceptionHandlerAdvice {
    Logger log = LoggerFactory.getLogger(GlobalExceptionHandlerAdvice.class);

    @ExceptionHandler({Exception.class})    // 什么异常的处理
    public ResponseMessage handlerException(Exception e, HttpServletRequest request, HttpServletResponse response){
        // 记录日志
        log.error("统一异常", e);
        // 返回码 500 -> 后端异常
        return new ResponseMessage(500, "error", null);
    }
}
