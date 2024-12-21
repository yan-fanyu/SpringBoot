package com.opencode.springboot01.pojo;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseMessage(Integer code, String message, T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

    // 请求接口
    public static <T> ResponseMessage<T> success(T data){
        return new ResponseMessage<>(HttpStatus.OK.value(), "success", data);
    }

    // 请求接口
    public static <T> ResponseMessage<T> success(){
        return new ResponseMessage<>(HttpStatus.OK.value(), "success", null);
    }
}
