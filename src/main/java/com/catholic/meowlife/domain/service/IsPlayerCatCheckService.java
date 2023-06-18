package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.application.view.CreateCatView;
import com.catholic.meowlife.application.view.GameView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsPlayerCatCheckService {
    @Autowired
    GameView gameView;

    @Autowired
    CreateCatView createCatView;

    public void isCat(boolean hasCat){
        if(hasCat){
            gameView.gameView();
        }
        else{
            createCatView.createCatView();
        }
    }
}
