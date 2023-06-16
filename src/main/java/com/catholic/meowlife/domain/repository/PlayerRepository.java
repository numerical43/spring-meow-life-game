package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PlayerRepository {

    @Autowired
    PlayerEntity playerEntity;

    public void addPlayer(PlayerDTO playerDto){
        playerEntity.setId(playerDto.getId());
        playerEntity.setPw(playerDto.getPw());
        playerEntity.setPw(playerDto.getName());
        PlayerDB.getPlayerMap().put(playerDto.getId(), playerEntity);
    }

}
