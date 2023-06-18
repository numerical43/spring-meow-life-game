package com.catholic.meowlife.application.controller;

import com.catholic.meowlife.application.service.EndingService;
import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.application.view.BadEnding1App;
import com.catholic.meowlife.application.view.BadEnding2App;
import com.catholic.meowlife.application.view.HappyEndingApp;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EndingController {

    @Autowired
    RegisterService registerService;

    @Autowired
    EndingService endingService;

    @Autowired
    BadEnding1App badEnding1App;

    @Autowired
    BadEnding2App badEnding2App;

    @Autowired
    HappyEndingApp happyEndingApp;

    public void result(int res, CatDTO catDTO){
        switch (res){
            case 1:
                endingService.deleteCatDTO();
                badEnding1App.getName(catDTO.getCatName());
                break;
            case 2:
                endingService.deleteCatDTO();
                badEnding2App.getName(catDTO.getCatName());
                break;
            case 3:
                endingService.deleteCatDTO();
                happyEndingApp.getName(catDTO.getCatName());

        }
    }

}
