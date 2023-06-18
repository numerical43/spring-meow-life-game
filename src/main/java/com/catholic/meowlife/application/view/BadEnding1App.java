package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.RegisterController;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BadEnding1App {
    @Autowired
    CreateCatView createCatView;
    public void getName(String catName){

        System.out.println("");
        System.out.println("");

        System.out.println("당신은 " + catName + " 학대죄로 체포되었습니다. 평생 감옥에서 살게 됐습니다. ");
        System.out.println(catName + " 은(는) 새로운 주인을 만나 행복하게 살았습니다. ");

        System.out.println("");

        System.out.println("                                _________________________");
        System.out.println("                                   ||   ||     ||   ||   ");
        System.out.println("                                   ||   ||, , ,||   ||   ");
        System.out.println("                                   ||  (||/|/(\\||/  ||  ");
        System.out.println("                                   ||  ||| _'_`|||  ||   ");
        System.out.println("                                   ||   || o o ||   ||   ");
        System.out.println("                                   ||  (||  - `||)  ||   ");
        System.out.println("                                   ||   ||  =  ||   ||   ");
        System.out.println("                                   ||   ||\\___/||   ||   ");
        System.out.println("                                  /||---||-\\_/-||---||\\ ");
        System.out.println("                                 / ||--_||_____||_--|| \\ ");


        System.out.println("");

        System.out.println("                                    ⁜©Team CatHolic.⁜    ");

        System.out.println("");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        createCatView.createCatView();
    }

}
