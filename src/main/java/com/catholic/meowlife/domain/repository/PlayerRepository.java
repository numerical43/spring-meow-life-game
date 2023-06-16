package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Repository
public class PlayerRepository {
    @Autowired
    PlayerEntity playerEntity;

    public void addPlayer(String id, String pw, String name){
        playerEntity.setId(id);
        playerEntity.setPw(pw);
        playerEntity.setPw(name);
//        PlayerEntity playerEntity = new PlayerEntity(id, pw, name);
        PlayerDB.getPlayerMap().put(id, playerEntity);
    }

}
