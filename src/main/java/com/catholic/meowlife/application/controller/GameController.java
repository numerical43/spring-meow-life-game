package com.catholic.meowlife.application.controller;

import com.catholic.meowlife.application.service.GameService;
import com.catholic.meowlife.application.view.FeedView;
import com.catholic.meowlife.application.view.PlayView;
import com.catholic.meowlife.application.view.SleepView;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class GameController {
    @Autowired
    private GameService gameService;

    @Autowired
    private PlayView playView;
    @Autowired
    private FeedView feedView;
    @Autowired
    private SleepView sleepView;

    public boolean gameSelect(int input) {
        boolean exit = false;

        switch (input) {
            case 1 : {
                gameService.sleepCat();
                sleepView.sleepCatView();
                break;
            }
            case 2 : {
                gameService.feedCat();
                feedView.feedCatView();
                break;
            }
            case 3: {
                gameService.playCat();
                playView.playCatView();
                break;
            }
            case 9: {
                exit = true;
                break;
            }
            default: {
                System.out.println("잘못된 숫자를 입력하셨습니다.");
                break;
            }
        }

        return exit;
    }
    public CatDTO getCat() {
        return gameService.getCat();
    }
}
