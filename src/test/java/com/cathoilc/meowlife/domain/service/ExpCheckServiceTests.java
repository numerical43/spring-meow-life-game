//package com.cathoilc.meowlife.domain.service;
//
//
//import com.catholic.meowlife.config.ContextConfiguration;
//import com.catholic.meowlife.domain.service.ExpCheckService;
//import com.catholic.meowlife.dto.CatDTO;
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
//
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//@SpringJUnitConfig(classes = {ContextConfiguration.class})
//public class ExpCheckServiceTests {
//
//    @Autowired
//    private ExpCheckService expCheckService;
//    private CatDTO exp;
//
//
//    @DisplayName("경험치가 100이상이면 true를 반환하는지 테스트")
//    @Test
//    public void testIsExpReached100With100OverParameter() {
//
//
//        //given
//        CatDTO catDTO = new CatDTO("미미", "코숏", 50, 1, 100, 1);
//
//        //when
//        boolean result = expCheckService.isExpReached100(catDTO);
//
//        //then
//        assertTrue(result);
//    }
//
//    @DisplayName("경험치가 100미만이면 false를 반환하는지 테스트")
//    @Test
//    public void testIsExpReached100With100UnderParameter() {
//
//        //given
//        CatDTO catDTO = new CatDTO("미미", "코숏", 50, 1, 10, 1);
//
//        //when
//        boolean result = expCheckService.isExpReached100(catDTO);
//
//        //then
//        assertFalse(result);
//    }
//
//    @DisplayName("경험치가 100이면 true를 반환하는지 테스트")
//    @Test
//    public void testIsExpReached100With100Parameter() {
//
//        //given
//        CatDTO catDTO = new CatDTO("미미", "코숏", 50, 1, 100, 1);
//
//        //when
//        boolean result = expCheckService.isExpReached100(catDTO);
//
//        //then
//        assertTrue(result);
//    }
//}
