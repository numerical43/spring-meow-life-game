package com.catholic.meowlife.config;



import com.catholic.meowlife.application.controller.RegisterController;
import com.catholic.meowlife.application.service.RegisterService;
import com.catholic.meowlife.application.view.BadEnding1App;
import com.catholic.meowlife.application.view.BadEnding2App;
import com.catholic.meowlife.application.view.HappyEndingApp;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.domain.service.IdCheckService;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.catholic.meowlife")
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
    CatRepository catRepository() {
        return new CatRepository();
    }

    @Bean
    CatEntity catEntity() {
        return new CatEntity();
    }

    @Bean
    CatDB catDB() {
        return new CatDB();
    }

    @Bean
    PlayerDB playerDB() {
        return new PlayerDB();
    }

    @Bean
    CatDTO catDTO() { return new CatDTO();}
    @Bean
    BadEnding1App badEnding1App() {
        return new BadEnding1App();
    }
    @Bean
    BadEnding2App badEnding2App() {
        return new BadEnding2App();
    }
    @Bean
    HappyEndingApp happyEndingApp() {
        return new HappyEndingApp();
    }
}
