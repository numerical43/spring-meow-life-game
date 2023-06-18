package com.catholic.meowlife.application.view;

import org.springframework.beans.factory.annotation.Autowired;

public class BadEnding2App {

    @Autowired
    CreateCatView createCatView;

    public void getName(String catName){
        System.out.println("!!!고양이가 10kg 를 넘기다니!!!");
        System.out.println("당신은 " + catName + " 확대죄로 체포되었습니다. 평생 감옥에서 살게 됐습니다. ");
        System.out.println(catName+" 은(는) 새로운 주인을 만나 행복하게 살았습니다. ");

        System.out.println("");

        System.out.println("  _________________________");
        System.out.println("     ||   ||     ||   ||   ");
        System.out.println("     ||   ||, , ,||   ||   ");
        System.out.println("     ||  (||/|/(\\||/  ||  ");
        System.out.println("     ||  ||| _'_`|||  ||   ");
        System.out.println("     ||   || o o ||   ||   ");
        System.out.println("     ||  (||  - `||)  ||   ");
        System.out.println("     ||   ||  =  ||   ||   ");
        System.out.println("     ||   ||\\___/||   ||   ");
        System.out.println("    /||---||-\\_/-||---||\\ ");
        System.out.println("   / ||--_||_____||_--|| \\ ");


        System.out.println("");

        System.out.println("      ⁜©Team CatHolic.⁜    ");

        System.out.println("");

        createCatView.createCatView();
    }
}
