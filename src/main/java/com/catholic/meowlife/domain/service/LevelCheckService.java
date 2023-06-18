package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.dto.CatDTO;
import org.springframework.stereotype.Component;

@Component
public class LevelCheckService {
    public boolean checkLevelMax(CatDTO catDTO) {
        if (catDTO.getLevel() >= 5) {
            return true;
        }
        return false;
    }


    public boolean checkLevelMin(CatDTO catDTO) {
        if (catDTO.getLevel() < 5) {
            return false;
        }
        return true;
    }
}


