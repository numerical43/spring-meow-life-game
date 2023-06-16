package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EnergyCheckService {
    @Autowired
    CatDTO catDTO;

    @Autowired
    PlayerDTO playerDTO;

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
