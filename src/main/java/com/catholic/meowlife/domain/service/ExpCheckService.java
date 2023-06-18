package com.catholic.meowlife.domain.service;
import com.catholic.meowlife.dto.CatDTO;
import org.springframework.stereotype.Component;

@Component
public class ExpCheckService {
    public boolean isExpReached100(CatDTO catDTO) {
        return catDTO.getExp() >= 100;
    }
}
