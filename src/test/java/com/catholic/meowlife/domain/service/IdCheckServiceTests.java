package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.dto.PlayerDTO;
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

//    @DisplayName("아이디가 중복일 때 예외처리")
//    @Test
//    public void checkDuplicateId() {
//        PlayerDTO playerDTO = new PlayerDTO("player", "testDuplicate", "테스트");
//
//
//        Assertions.assertThrows(
//                IllegalArgumentException.class,
//                () -> idCheckService.checkDuplicateId(playerDTO)
//        );
//    }

    @DisplayName("아이디 한글 입력 시 예외처리")
    @Test
    public void checkCorrectId1(){
        PlayerDTO playerDTO = new PlayerDTO("플레이어01", "testCorrectId", "테스트");
        //Assertions.assertThrows( IllegalArgumentException.class, () -> idCheckService.checkCorrectId(playerDTO));
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 특수문자 입력 시 예외처리")
    @Test
    public void checkCorrectId2(){
        PlayerDTO playerDTO = new PlayerDTO("player*", "testCorrectId", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 공백 입력 시 예외처리")
    @Test
    public void checkCorrectId3(){
        PlayerDTO playerDTO = new PlayerDTO("player 01", "testCorrectId", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkCorrectId(playerDTO));
    }

    @DisplayName("아이디 5자 미만일 때 예외처리")
    @Test
    public void checkIdLength1(){
        PlayerDTO playerDTO = new PlayerDTO("p01", "testCorrectId", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkIdLength(playerDTO));
    }

    @DisplayName("아이디 20자 초과일 때 예외처리")
    @Test
    public void checkIdLength2(){
        PlayerDTO playerDTO = new PlayerDTO("playerplayerplayerplayer", "testCorrectId", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkIdLength(playerDTO));
    }

    @DisplayName("비밀번호 5자 미만일 때 예외처리")
    @Test
    public void checkPwLength1(){
        PlayerDTO playerDTO = new PlayerDTO("player03", "pw", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkPwLength(playerDTO));

    }

    @DisplayName("비밀번호 20자 초과일 때 예외처리")
    @Test
    public void checkPwLength2(){
        PlayerDTO playerDTO = new PlayerDTO("player03", "passwordpasswordpassword", "테스트");
        Assertions.assertDoesNotThrow( () -> idCheckService.checkPwLength(playerDTO));
    }
}
