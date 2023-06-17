package com.catholic.meowlife.application.service;

import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.repository.PlayerRepository;
import com.catholic.meowlife.domain.service.IsPlayerCatCheckServiceTests;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(classes = ContextConfiguration.class)
public class LoginService {

    @Autowired
    PlayerRepository playerRepository;
    @Autowired
    PlayerEntity playerEntity;

    // 메인 삭제
    @Autowired
    CatDB catDB;
    @Autowired
    CatEntity catEntity;

    @Autowired
    PlayerDB playerDB;

    @Autowired
    IsPlayerCatCheckServiceTests isPlayerCatCheckService;

    @Test
    public void LoginTest(){
        String loginId = "qlql";
        String loginPw = "123";

        logIn(loginId, loginPw);
    }

    public void logIn(String loginId, String loginPw) {
        playerEntity = new PlayerEntity("qlql", "123", "홍길동");
        catEntity = new CatEntity("미로","코숏",100, 2.0, 0, 1);
        catDB.getCatMap().put(playerEntity.getId(), catEntity);
        playerDB.getPlayerMap().put("qlql", playerEntity);
        playerRepository.returnDBIdPw(loginId, loginPw);
        setLoginPlayer();
        playerHasCat();
    }

    public void setLoginPlayer(){
        PlayerDTO.loginPlayer = new PlayerDTO(playerEntity.getId(), playerEntity.getPw(), playerEntity.getName());
    }

    public void playerHasCat(){
        String userId = PlayerDTO.loginPlayer.getId();
        boolean hasCat = playerRepository.HasCat(userId);
        isPlayerCatCheckService.isCat(hasCat);
    }
}
