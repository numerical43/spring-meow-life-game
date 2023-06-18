package com.cathoilc.meowlife.domain.service;

import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.service.LevelCheckService;
import com.catholic.meowlife.dto.CatDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class LevelCheckServiceTests {
//    LevelCheckService levelCheckService = new LevelCheckService();

    @Autowired
    LevelCheckService levelCheckService;
    private CatDTO level;

    @DisplayName("레벨이 5가 되면 true를 반환하는지 확인")
    @Test
    public void testIsLevelReached5(){

        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 1, 1, 5);

        // when
        boolean result = levelCheckService.checkLevelMax(catDTO);

        // then
        assertTrue(result);
    }
    
    @DisplayName("레벨이 5 이하이면 false를 반환하는지 확인")
    @Test
    public void testIsLevelnotReached5(){

        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 1, 1,3);

        // when
        boolean result = levelCheckService.checkLevelMin(catDTO);

        // then
        assertFalse(result);
    }


}
