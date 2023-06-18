package com.catholic.meowlife.application.view;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MainView {
    @Autowired
    RegisterView registerView;

    @Autowired
    LoginView loginView;
    public void mainView() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        while (choice != 9) {

            System.out.println("");
            System.out.println("");


            System.out.println("〇");
            System.out.println("　　ｏ");
            System.out.println("　　°");
            System.out.println("　┳┳ ∩∩");
            System.out.println("　┃┃(･∀･)　☆　　★");
            System.out.println("┏┻┻┷━Ｏ ┏┷┓┏┷┓");
            System.out.println("┃Welcome┠┨★┠┨☆┃");
            System.out.println("┗©━━©┛ ┗©┛┗©┛");
            System.out.println("");
            System.out.println("⁜©Team CatHolic.⁜");


            System.out.println("");
            System.out.println("");

            System.out.print("[1] 회원가입 [2] 로그인 [9] 프로그램 종료 : ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerView.registerView();
                    break;
                case 2:
                    loginView.loginView();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    break;
                default:
                    System.out.println("잘못된 선택입니다. 다시 선택하세요.");
                    break;
            }
        }
    }
}
