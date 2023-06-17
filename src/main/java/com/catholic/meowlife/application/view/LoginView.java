package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.LoginController;
import com.catholic.meowlife.application.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class LoginView {
    @Autowired
    LoginService loginService;

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner sc = new Scanner(System.in);

                System.out.print("아이디: ");
                String id = sc.next();

                System.out.print("비밀번호: ");
                String pw = sc.next();


                ApplicationContext context =
                        new AnnotationConfigApplicationContext("com.catholic.meowlife");

                LoginController loginController = context.getBean("loginController", LoginController.class);
                loginController.loginService(id, pw);
                break;
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage().toString());
            }
        }
    }
}
