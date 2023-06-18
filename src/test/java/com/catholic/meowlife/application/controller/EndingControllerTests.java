//package com.catholic.meowlife.application.controller;
//
//import com.catholic.meowlife.config.ContextConfiguration;
//import com.catholic.meowlife.domain.entity.CatEntity;
//import com.catholic.meowlife.domain.entity.PlayerEntity;
//import com.catholic.meowlife.dto.CatDTO;
//import com.catholic.meowlife.dto.PlayerDTO;
//import com.catholic.meowlife.infra.DB.CatDB;
//import com.catholic.meowlife.infra.DB.PlayerDB;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//
//@SpringJUnitConfig(classes = {ContextConfiguration.class})
//public class EndingControllerTests {
//
//    @Autowired
//    PlayerDTO playerDTO;
//    @Autowired
//    EndingController endingController;
//
//    ApplicationContext context = new AnnotationConfigApplicationContext("com.catholic.meowlife");
//
//    @DisplayName("베드엔딩1 일때 플레이어 DB 삭제 확인")
//    @Test
//    public void checkDeleteDBBadEnding1(){
//        CatDB.getCatMap().put(playerDTO.getId(), new CatEntity("test","코숏",50,20,10,1));
//        int before = CatDB.getCatMap().size();
//        endingController.result(1, new CatDTO("test","코숏",0,0,10,1));
//        int after = CatDB.getCatMap().size();
//
//        Assertions.assertEquals(1, before-after);
//    }
//
//    @DisplayName("베드엔딩2 일때 플레이어 DB 삭제 확인")
//    @Test
//    public void checkDeleteDBBadEnding2(){
//        CatDB.getCatMap().put(playerDTO.getId(), new CatEntity("test","코숏",50,20,10,1));
//        int before = CatDB.getCatMap().size();
//        endingController.result(2, new CatDTO("test","코숏",0,0,10,1));
//        int after = CatDB.getCatMap().size();
//
//        Assertions.assertEquals(1, before-after);
//    }
//
//    @DisplayName("해피엔딩 일때 플레이어 DB 삭제 확인")
//    @Test
//    public void checkDeleteDBHappyEnding(){
//        CatDB.getCatMap().put(playerDTO.getId(), new CatEntity("test","코숏",50,20,10,1));
//        int before = CatDB.getCatMap().size();
//        endingController.result(3, new CatDTO("test","코숏",0,0,10,1));
//        int after = CatDB.getCatMap().size();
//        Assertions.assertEquals(1, before-after);
//    }
//}
