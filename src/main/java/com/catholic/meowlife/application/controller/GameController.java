package com.catholic.meowlife.application.controller;

import com.catholic.meowlife.application.service.GameService;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class GameController {
    @Autowired
    private GameService gameService;

    public boolean gameSelect(int input) {
        boolean exit = false;

        switch (input) {
            case 1 : {
                gameService.sleepCat();
                break;
            }
            case 2 : {
                gameService.feedCat();
                break;
            }
            case 3: {
                gameService.playCat();
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
