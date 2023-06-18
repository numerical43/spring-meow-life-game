package com.catholic.meowlife.application.controller;

import com.catholic.meowlife.application.service.CreateCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class CatController {
    @Autowired
    CreateCatService createCatService;


    public void createWhatCat(String catName, String catBreeds) {
        if (catBreeds.equals("코숏")){
            createCatService.createCat(catName, catBreeds);
        }
        if (catBreeds.equals("러시안블루")){
            createCatService.createCat(catName, catBreeds);
        }
        if (catBreeds.equals("노르웨이숲")){
            createCatService.createCat(catName, catBreeds);
        }
    }
}
