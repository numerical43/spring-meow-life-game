package com.catholic.meowlife.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IsPlayerCatCheckService {

    public void isCat(boolean hasCat){
        if(hasCat){
            // 게임 화면 뷰
            System.out.println("게임 화면 뷰");
        }
        else{
            // 고양이 생성 뷰

        }
    }
}
