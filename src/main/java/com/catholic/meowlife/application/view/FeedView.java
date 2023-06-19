package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.GameController;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FeedView {
    @Autowired
    private GameController gameController;
    @Autowired
    private CatDTO cat;

    public void feedCatView() {
        cat = gameController.getCat();

        System.out.println("\n" +
                           "　　　∧-∧\n" +
                           "　　（*･ω･）\n" +
                           "　 ＿|　⊃／\\(＿＿_\n" +
                           "／　└-(＿＿🍽️＿_／\n" +
                           "￣￣￣￣￣￣￣");
        System.out.print("정말 맛있어! " + cat.getCatName() + " 은(는) 맛있게 밥을 먹었습니다!");
    }
}
