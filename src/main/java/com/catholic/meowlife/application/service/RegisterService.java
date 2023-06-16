package com.catholic.meowlife.application.service;

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

    public String signIn(PlayerDTO playerDTO) {

        this.playerDTO = playerDTO;

        try {
            if (idCheckService.checkPwLength(playerDTO)
                    && idCheckService.checkIdLength(playerDTO)
                    && idCheckService.checkCorrectId(playerDTO)) {
                playerRepository.addPlayer(playerDTO);
            }
            return PlayerDB.getPlayerMap().toString();
        } catch (IllegalArgumentException e){
            return "error";
        }
    }


}
