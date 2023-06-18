package com.catholic.meowlife.application.service;

import com.catholic.meowlife.application.view.GameView;
import com.catholic.meowlife.domain.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCatService {
    @Autowired
    CatRepository catRepository;

    @Autowired
    GameView gameView;

    public void createCat(String catName, String catBreeds) {
        catRepository.createCatInDB(catName,catBreeds);
        gameView.gameView();
    }
}
