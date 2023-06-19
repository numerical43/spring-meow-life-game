package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.GameController;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayView {
    @Autowired
    private GameController gameController;
    @Autowired
    private CatDTO cat;

    public void playCatView() {
        cat = gameController.getCat();

        System.out.println("\n" +
                           "　 　∧_∧\n" +
                           "　 (`･ω･´ ) 三\n" +
                           "　　O┳〇 )\n" +
                           "　　◎し◎- 三");
        System.out.print("너무 즐겁다! " + cat.getCatName() + " 은(는) 재밌게 놀았습니다!");
    }
}
