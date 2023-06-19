package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.GameController;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SleepView {
    @Autowired
    private GameController gameController;
    @Autowired
    private CatDTO cat;

    public void sleepCatView() {

        cat = gameController.getCat();

        System.out.println("\n" +
                           "●┳┳┳┳┳┳┳┳┳┳┳┳┳┳┳● z\n" +
                           "  ┣  ∧_∧       ┫z\n" +
                           "  ┃ ( ◞ ‸ ◟) Z┃\n" +
                           "   ノ^`⊂        ＼\n" +
                           "(　ノ ●　         ＼●\n" +
                           "＼　  ┣┳┳┳┳┳┳┳┳┳┳┳┳┳┳┫\n" +
                           "　 ＼ ┣┻┻┻┻┻┻┻┻┻┻┻┻┻┻┻");
        System.out.print("쿨쿨... " + cat.getCatName() + " 은(는) 개운하게 잘잤습니다!");
    }
}
