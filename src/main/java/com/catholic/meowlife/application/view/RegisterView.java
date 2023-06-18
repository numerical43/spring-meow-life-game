package com.catholic.meowlife.application.view;

import com.catholic.meowlife.domain.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.catholic.meowlife.application.controller.RegisterController;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class RegisterView {
    @Autowired
    PlayerRepository playerRepository;

    @Autowired
    PlayerDTO playerDTO;


    public void registerView() {


        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("");

        System.out.println("■■       ■■   ■■■■■■■■■■  ■■■■■■■■■   ■■       ■■          ■■         ■■■■■■■■■  ■■■■■■■■■   ■■■■■■■■■■");
        System.out.println("■■■■   ■■■■  ■■          ■■■     ■■■  ■■   ■   ■■          ■■             ■      ■■         ■■         ");
        System.out.println("■■  ■■■  ■■  ■■■■■■■■■■  ■■■     ■■■  ■■  ■■■  ■■          ■■             ■      ■■■■■■■■■  ■■■■■■■■■■ ");
        System.out.println("■■   ■   ■■  ■■          ■■■     ■■■  ■■■■   ■■■■          ■■             ■      ■■         ■■         ");
        System.out.println("■■       ■■   ■■■■■■■■■■  ■■■■■■■■■   ■■       ■■          ■■■■■■■■■  ■■■■■■■■■  ■■          ■■■■■■■■■■");

        System.out.println("");

        System.out.println("                                      ⁜©Team CatHolic.⁜                                              ");

        System.out.println("                 ⁜아이디와 비밀번호는 영문, 숫자로만 이루어지는 5~20자 단어로 해주세요.⁜                         ");

        System.out.println("");

        while(true) {
            try {
                Scanner sc = new Scanner(System.in);


                System.out.print("아이디: ");
                String id = sc.next();

                System.out.print("비밀번호: ");
                String pw = sc.next();

                System.out.print("이름: ");
                String name = sc.next();

                ApplicationContext context = new AnnotationConfigApplicationContext("com.catholic.meowlife");

                RegisterController registerController = context.getBean("registerController", RegisterController.class);

                boolean result = registerController.gotoRegisterService(new PlayerDTO(id, pw, name));
                if (result){
                    break;
                }
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage().toString());
            }
        }
        playerRepository.addPlayer(playerDTO);
    }
}
