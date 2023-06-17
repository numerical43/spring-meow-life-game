package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class PlayerRepository {
    @Autowired
    PlayerEntity playerEntity;
    @Autowired
    CatEntity catEntity;

    @Autowired
    PlayerDTO loginPlayer;

    @Autowired
    PlayerDB playerDB;
    @Autowired
    CatDB catDB;



    public void returnDBIdPw(String userId,String userPw){
        playerEntity = playerDB.getPlayerMap().get(userId);
        String pw = playerEntity.getPw();

        if(playerEntity == null || !userId.equals(playerEntity.getId())){
            throw new IllegalArgumentException();
        }
        if(pw == null || !pw.equals(userPw)){
            throw new IllegalArgumentException();
        }
    }

    public Boolean HasCat(String userId) {
        catEntity = catDB.getCatMap().get(userId);

        if(catEntity == null){
            return false;
        }
        return true;
    }
}
