package com.cathoilc.meowlife.domain.service;

import com.catholic.meowlife.domain.service.WeightCheckService;
import com.catholic.meowlife.dto.CatDTO;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class WeightCheckServiceTests {

    private CatDTO weight;

    @DisplayName("고양이의 몸무게가 9 이상일 때 true를 반환하는지 확인")
    @Test
    public void testIsWarningOverWeight9() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 10, 1,5);
        // when
        boolean result = WeightCheckService.isWarningMaxWeight(catDTO);

        //then
        assertTrue(result);
    }

    @DisplayName("고양이의 몸무게가 9일 때 true를 반환하는지 확인")
    @Test
    public void testIsWarningWeight9() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 9, 1,5);

        // when
        boolean result = WeightCheckService.isWarningMaxWeight(catDTO);

        //then
        assertTrue(result);
    }

    @DisplayName("고양이의 몸무게가 9 이하일 때 false를 반환하는지 확인")
    @Test
    public void testIsWarningUnderWeight9() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 5, 1,5);

        // when
        boolean result = WeightCheckService.isWarningMaxWeight(catDTO);

        //then
        assertFalse(result);
    }


    @DisplayName("고양이의 몸무게가 10을 초과했을 때 true를 반환하는지 확인")
    @Test
    public void testIsWarningUpperWeight10() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 11, 1,5);

        // when
        boolean result = WeightCheckService.isMaxWeight(catDTO);

        //then
        assertTrue(result);
    }

    @DisplayName("고양이의 몸무게가 10을 초과하지 않았을 때 false를 반환하는지 확인")
    @Test
    public void testIsWarningInnerWeight10() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40,5,1,5);

        // when
        boolean result = WeightCheckService.isWarningMaxWeight(catDTO);

        //then
        assertFalse(result);
    }

    @DisplayName("고양이의 몸무게가 0.5 이상일 때, false를 반환하는지 확인")
    @Test
    public void testIsOverofMinWeight() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 1, 1,5);

        // when
        boolean result = WeightCheckService.isMinWeight(catDTO);

        // then
        assertFalse(result);
    }

    @DisplayName("고양이의 몸무게가 0.5일 때, true를 반환하는지 확인")
    @Test
    public void testIsMinWeight() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 0.5, 1,5);
        // when
        boolean result = WeightCheckService.isMinWeight(catDTO);

        // then
        assertTrue(result);
    }


    @DisplayName("고양이의 몸무게가 0.5 미만일 때, true를 반환하는지 확인")
    @Test
    public void testIsMinofWeight() {
        // given
        CatDTO catDTO = new CatDTO("미미", "코숏", 40, 0.3, 1,5);

        // when
        boolean result = WeightCheckService.isMinWeight(catDTO);

        // then
        assertTrue(result);
    }
}


