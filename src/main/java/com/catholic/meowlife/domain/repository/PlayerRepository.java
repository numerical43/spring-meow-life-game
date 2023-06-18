package com.catholic.meowlife.domain.repository;


import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;

import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepository {
    @Autowired
    PlayerEntity playerEntity;
    @Autowired
    CatEntity catEntity;

    @Autowired
    PlayerDTO loginPlayer;



    public void returnDBIdPw(String userId,String userPw){
        PlayerEntity storedPlayer = PlayerDB.getPlayerMap().get(userId);

        if(storedPlayer == null || !userId.equals(storedPlayer.getId())){
            throw new IllegalArgumentException("아이디가 일치하지 않습니다.");
        }
        if(storedPlayer.getPw() == null || !storedPlayer.getPw().equals(userPw)){
            throw new IllegalArgumentException("비밀번호가 일치하지 않습니다.");
        }
    }

    public Boolean HasCat(String userId) {
        catEntity = CatDB.getCatMap().get(userId);

        if(catEntity == null){
            return false;
        }
        return true;
    }

    public void addPlayer(PlayerDTO playerDto){
        playerEntity.setId(playerDto.getId());
        playerEntity.setPw(playerDto.getPw());
        playerEntity.setPw(playerDto.getName());
        PlayerDB.getPlayerMap().put(playerDto.getId(), playerEntity);
    }
}
