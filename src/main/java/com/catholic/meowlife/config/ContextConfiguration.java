package com.catholic.meowlife.config;


//import com.catholic.meowlife.application.service.GameService;
//import com.catholic.meowlife.application.view.GameView;
import com.catholic.meowlife.application.controller.EndingController;
import com.catholic.meowlife.application.controller.GameController;
import com.catholic.meowlife.application.service.GameService;
import com.catholic.meowlife.application.service.LoginService;
import com.catholic.meowlife.application.view.*;
//import com.catholic.meowlife.application.view.GameView;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.domain.repository.PlayerRepository;
import com.catholic.meowlife.domain.service.EnergyCheckService;
import com.catholic.meowlife.domain.service.ExpCheckService;
import com.catholic.meowlife.domain.service.IdCheckService;
//import com.catholic.meowlife.domain.service.WeightCheckService;


import com.catholic.meowlife.application.controller.RegisterController;
import com.catholic.meowlife.application.service.RegisterService;
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
@ComponentScan("com.catholic.meowlife")
public class ContextConfiguration {

    // View
//    @Bean
//    public GameView gameView() {
//        return new GameView();
//    }

    // Entity

//    @Bean
//    public GameView gameView(){ return new GameView();}
    @Bean
    public CatEntity catEntity() {
        return new CatEntity();
    }
    @Bean
    public PlayerEntity player() {
        return new PlayerEntity();
    }


    // DTO
    @Bean
    public CatDTO catDTO(){
        return new CatDTO();
    }

    @Bean
    public PlayerDTO playerDTO() {
        return new PlayerDTO();
    }


    // Controller
    @Bean
    public GameController gameController() {
        return new GameController();
    }

    @Bean
    public EndingController endingController() {
        return new EndingController();
    }


    // Service
    @Bean
    public GameService gameService() {
        return new GameService();
    }

    @Bean
    public EnergyCheckService energyCheckService() {
        return new EnergyCheckService();
    }

//    @Bean
//    public WeightCheckService weightService() {
//        return new WeightCheckService();
//    }

    @Bean
    public IdCheckService idService() {
        return new IdCheckService();
    }

    @Bean
    public ExpCheckService expCheckService() {
        return new ExpCheckService();
    }


    // Repository
    @Bean
    public CatRepository catRepository() {
        return new CatRepository();
    }

    @Bean
    public PlayerRepository playerRepository() {
        return new PlayerRepository();
    }


    // DB
    @Bean
    public CatDB catDB() {
        return new CatDB();
    }

    @Bean
    public PlayerDB playerDB() {
        return new PlayerDB();
    }
        @Bean
        public PlayerEntity playerGenerator () {
            return new PlayerEntity();
        }
        @Bean
        public PlayerDTO dtoGenerator () {
            return new PlayerDTO();
        }

        @Bean
        public IdCheckService idCheckService () {
            return new IdCheckService();
        }

        @Bean
        public RegisterService registerService () {
            return new RegisterService();
        }
        @Bean
        RegisterController registerController () {
            return new RegisterController();
        }
        @Bean
        BadEnding1App badEnding1App () {
            return new BadEnding1App();
        }
        @Bean
        BadEnding2App badEnding2App () {
            return new BadEnding2App();
        }
        @Bean
        HappyEndingApp happyEndingApp () {
            return new HappyEndingApp();
        }

        @Bean
        public CreateCatView createCatView(){
            return new CreateCatView();
        }

//        @Bean
//        public LoginService loginService(){
//            return new LoginService();
//        }
//        @Bean
//        public LoginView loginView() {
//            return new LoginView();
//        }
}
