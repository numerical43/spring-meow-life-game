package com.catholic.meowlife.application.service;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.repository.PlayerRepository;
import com.catholic.meowlife.domain.service.IdCheckService;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class RegisterService {

    private static PlayerDTO playerDTO;

    @Autowired
    IdCheckService idCheckService;

    @Autowired
    PlayerRepository playerRepository;

    public Map<String, PlayerEntity> signIn(PlayerDTO playerDTO) {

        this.playerDTO = playerDTO;

        if(idCheckService.checkPwLength(playerDTO)
        &&idCheckService.checkIdLength(playerDTO)
        &&idCheckService.checkCorrectId(playerDTO)){
            playerRepository.addPlayer(playerDTO. getId(),playerDTO.getPw(),playerDTO.getName());

//            PlayerDB.getPlayerMap().put(playerDTO.getId(),
//                    new PlayerEntity(playerDTO.getId(), playerDTO.getPw(), playerDTO.getName()));
        }

        return PlayerDB.getPlayerMap();
    }




}
