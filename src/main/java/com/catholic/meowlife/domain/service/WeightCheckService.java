package com.catholic.meowlife.domain.service;

import com.catholic.meowlife.dto.CatDTO;
import org.springframework.stereotype.Component;

@Component
public class WeightCheckService {

//    경고 : 몸무게가 1이하, 9이상이면 true 반환 아니면 false 반환
//    Min : 몸무게가 0.5이하면 ture 반환 아니면 false 반환
//    Max : 몸무게가 10 초과면 true 반환 아니면 false 반환


    public static boolean checkWarningWeght(CatDTO catDTO){
        if(catDTO.getWeight() >=9 || catDTO.getWeight() <=1){
            return true;
        }
        return false;
    }

    public static boolean checkMinWeight(CatDTO catDTO){
        if(catDTO.getWeight() <= 0.5){
            return true;
        }
        return false;
    }

    public static boolean checkMaxWeight(CatDTO catDTO){
        if(catDTO.getWeight() > 10){
            return true;
        }
        return false;
    }
}
