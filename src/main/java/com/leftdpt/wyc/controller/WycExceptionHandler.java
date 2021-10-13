package com.leftdpt.wyc.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author Geys
 * @date 2021/10/13 12:05
 */
@ControllerAdvice
public class WycExceptionHandler {
    
    @ExceptionHandler(Exception.class)
    public String exceptionHandle(){
       return "系统错误";
    }

    
}
