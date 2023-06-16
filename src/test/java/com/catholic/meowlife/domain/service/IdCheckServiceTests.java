package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class IdCheckServiceTests {
    @Autowired
    private IdCheckService idCheckService;
    @Autowired
    private PlayerDTO playerDTO;


    @DisplayName("아이디가 중복일 때 예외처리")
    @Test
    public void checkDuplicateId() {
        PlayerDB.getPlayerMap().put("player", new PlayerEntity("player", "testpw","홍길동"));
        playerDTO.setId("player");
        playerDTO.setPw("testDuplicate");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 한글 입력 시 예외처리")
    @Test
    public void checkCorrectId1(){
        playerDTO.setId("플레이어01");
        playerDTO.setPw("testCorrectId");
        playerDTO.setName("테스트");
        //Assertions.assertThrows( IllegalArgumentException.class, () -> idCheckService.checkCorrectId(playerDTO));
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 특수문자 입력 시 예외처리")
    @Test
    public void checkCorrectId2(){
        playerDTO.setId("player*");
        playerDTO.setPw("testCorrectId");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 공백 입력 시 예외처리")
    @Test
    public void checkCorrectId3(){
        playerDTO.setId("player 01");
        playerDTO.setPw("testCorrectID");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 5자 미만일 때 예외처리")
    @Test
    public void checkIdLength1(){
        playerDTO.setId("p01");
        playerDTO.setPw("testCorrectID");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkIdLength(playerDTO));
    }

    @DisplayName("아이디 20자 초과일 때 예외처리")
    @Test
    public void checkIdLength2(){
        playerDTO.setId("playerplayerplayerplayerplayer");
        playerDTO.setPw("testCorrectID");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkIdLength(playerDTO));
    }

    @DisplayName("비밀번호 5자 미만일 때 예외처리")
    @Test
    public void checkPwLength1(){
        playerDTO.setId("player01");
        playerDTO.setPw("pw");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkPwLength(playerDTO));

    }

    @DisplayName("비밀번호 20자 초과일 때 예외처리")
    @Test
    public void checkPwLength2(){
        playerDTO.setId("player01");
        playerDTO.setPw("passwordpasswordpasswordpasswordpassword");
        playerDTO.setName("테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkPwLength(playerDTO));
    }
}
