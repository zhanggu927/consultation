package com.annet.util;

import org.springframework.http.HttpStatus;

/**
 * Created by zhang on 2017-04-21.
 * Description:
 */
public class Message<T> {
    private HttpStatus code;
    private String message;
    private T data;

    public static final String OK = "ok";

    public Message() {
        super();
    }

    public Message(HttpStatus code, String message, T data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public HttpStatus getCode() {
        return code;
    }

    public void setCode(HttpStatus code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
