package com.catholic.meowlife.application.service;


import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.repository.PlayerRepository;
import com.catholic.meowlife.domain.service.IsPlayerCatCheckService;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    PlayerEntity playerEntity;

    @Autowired
    PlayerDB playerDB;

    @Autowired
    IsPlayerCatCheckService isPlayerCatCheckService;



    public void logIn(String loginId, String loginPw) {
        playerRepository.returnDBIdPw(loginId, loginPw);
        loginPlayer(loginId, loginPw);
    }

    public void loginPlayer(String loginId, String loginPw){
        playerEntity = playerRepository.getPlayerEntity(loginId);

        PlayerDTO.loginPlayer = new PlayerDTO(loginId, loginPw, playerEntity.getName());
    }

    public void playerHasCat(){
        String userId = PlayerDTO.loginPlayer.getId();
        boolean hasCat = playerRepository.HasCat(userId);
        isPlayerCatCheckService.isCat(hasCat);
    }
}
