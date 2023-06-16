package com.catholic.meowlife.application.service;

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

import java.util.Map;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class RegisterServiceTests {

    @Autowired
    private RegisterService registerService;

    ApplicationContext context = new AnnotationConfigApplicationContext("com.catholic.meowlife");

    @DisplayName("플레이어 생성 확인")
    @Test
    public void checkCreatePlayer(){

        Map<String, PlayerEntity> map
        = registerService.signIn(new PlayerDTO("player01", "testCreate", "테스트"));

        context.getBean("registerService", RegisterService.class);

        Assertions.assertEquals(map,PlayerDB.getPlayerMap());
    }

}
