package com.catholic.meowlife.config;


import com.catholic.meowlife.application.controller.RegisterController;
import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.service.IdCheckService;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.catholic.meowlife")
public class ContextConfiguration {

    @Bean
    public PlayerEntity playerGenerator() {
        return new PlayerEntity();
    }
    @Bean
    public PlayerDTO dtoGenerator()  {
        return new PlayerDTO();
    }

    @Bean
    public IdCheckService idCheckService(){
        return new IdCheckService();
    }

    @Bean
    public RegisterService registerService() {
        return new RegisterService();
    }
    @Bean
    RegisterController registerController() {
        return new RegisterController();
    }

    @Bean
    PlayerDB playerDB() {
        return new PlayerDB();
    }
}
