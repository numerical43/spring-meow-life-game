package com.catholic.meowlife.domain.service;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class EnergyCheckService {
    @Autowired
    PlayerDTO playerDTO;

    public boolean checkEnergyZero(CatDTO catDTO){
        if(catDTO.getEnergy()==0){
            return true;
        }
        return false;
    }

    public boolean checkEnergyLow(CatDTO catDTO) {
        if(catDTO.getEnergy()<=30){
            return true;
        }
        return false;
    }
}
