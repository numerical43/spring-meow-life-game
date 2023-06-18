package com.catholic.meowlife.application.controller;



import com.catholic.meowlife.application.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginController {
    @Autowired
    LoginService loginService;

    public void loginService(String id, String pw) {
        loginService.logIn(id, pw);
    }
}
