package com.catholic.meowlife.domain.service;


import com.catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@Component
@SpringJUnitConfig(classes = ContextConfiguration.class)
public class EnergyCheckServiceTests {
    @Autowired
    CatDTO catDTO;

    @Autowired
    PlayerDTO playerDTO;

    private int eatEnergy;
    public int increaseEnergy(PlayerEntity playerEntity, CatEntity catEntity) {
        if (playerEntity.isLogin()) {
            int beforeEnergy = catEntity.getEnergy();
            eatEnergy = catEntity.getEnergy() + 5;
            eatEnergy = (eatEnergy >= 100) ? 100 : eatEnergy;
            catEntity.setEnergy(eatEnergy);

            System.out.println("먹기 전 에너지 = " + beforeEnergy);
            System.out.println("먹기 이후 에너지 = " + eatEnergy);
        }
        return eatEnergy;
    }

    public boolean checkEnergyZero(CatDTO catDTO){
        if(catDTO.getEnergy()==0){
            return false;
        }
        return true;
    }

    public boolean checkLowEnergy(CatDTO catDTO) {
        if(catDTO.getEnergy()<=30){
            return false;
        }
        return true;
    }
}
