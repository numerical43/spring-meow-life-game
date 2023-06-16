package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.domain.service.EnergyCheckServiceTests;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.Map;

@Repository
@SpringJUnitConfig(classes = ContextConfiguration.class)
public class CatRepository {
    private int returnEnergy, checkEnergy;

    @Autowired
    CatDB catDB;

    @Autowired
    PlayerDB playerDB;

    @Autowired
    EnergyCheckServiceTests energyCheckService;

    public int returnEnergy(){
        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : catDB.getCatMap().entrySet()) {
            PlayerEntity playerEntity = playerCatEntry.getKey();
            CatEntity catEntity = playerCatEntry.getValue();

            // 기존 방식
            returnEnergy = energyCheckService.increaseEnergy(playerEntity, catEntity);

        }
        return returnEnergy;
    }
}
