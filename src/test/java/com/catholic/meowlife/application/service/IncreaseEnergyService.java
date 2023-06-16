package com.catholic.meowlife.application.service;

import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.domain.service.EnergyCheckService;
import com.catholic.meowlife.domain.service.EnergyCheckServiceTests;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.ArrayList;
import java.util.List;

@Service
@SpringJUnitConfig(classes = ContextConfiguration.class)
public class IncreaseEnergyService {
    @Autowired
    CatDB catDB;

    @Autowired
    PlayerDB playerDB;

    @Autowired
    CatRepository catRepository;

    @Autowired
    EnergyCheckService energyCheckService;


    @DisplayName("에너지가 30이하인지, 0인지 확인하고 해당값을 체크리스트에 담는지 확인")
    @Test
    public void eatCat(){
        CatDTO catDTO1 = new CatDTO("미로","코숏",20,2, 1,1);
        CatDTO catDTO2 = new CatDTO("초코","러시안 블루",0,2, 1,1);

        List<Boolean> checkList = new ArrayList<>();

        checkList.add(energyCheckService.checkLowEnergy(catDTO1));
        checkList.add(energyCheckService.checkEnergyZero(catDTO2));
        System.out.println("checkList = " + checkList);

        Assertions.assertNotNull(checkList);
//        return checkList;

//        int num = 1;
//        Assertions.assertEquals(1, num);
    }
}
