package com.leftdpt.wyc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Geys
 * @date 2021/10/13 11:56
 */
@RestController
@RequestMapping
public class TestCasController {
    
    @Resource
    private HttpServletRequest request;
    @Resource
    private HttpServletResponse response;
    @Value("${cas.server-url-prefix}")
    private String casServer;
    @Value("${cas.client-host-url}")
    private String clientHost;
    
    @GetMapping("/test")
    public String test(){
        return "登录成功";
    }
    
    @GetMapping("/logout")
    public void logout() throws IOException {
        request.getSession().invalidate();
        response.sendRedirect(casServer+"/logout?service="+clientHost);
    }
    
}
