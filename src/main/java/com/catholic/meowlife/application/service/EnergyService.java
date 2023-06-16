package com.catholic.meowlife.application.service;

import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.domain.service.EnergyCheckService;
import com.catholic.meowlife.dto.CatDTO;

import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnergyService {
    @Autowired
    CatDB catDB;

    @Autowired
    PlayerDB playerDB;

    @Autowired
    EnergyCheckService energyCheckService;

    public List<Boolean> eatCat(CatDTO catDTO){
        List<Boolean> checkList = new ArrayList<>();

        checkList.add(energyCheckService.checkLowEnergy(catDTO));
        checkList.add(energyCheckService.checkEnergyZero(catDTO));

        return checkList;
    }
}
