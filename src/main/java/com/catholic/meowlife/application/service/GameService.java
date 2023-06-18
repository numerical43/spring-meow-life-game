package com.catholic.meowlife.application.service;

import com.catholic.meowlife.application.controller.EndingController;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.repository.CatRepository;
import com.catholic.meowlife.domain.repository.PlayerRepository;
import com.catholic.meowlife.domain.service.*;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private EndingController endingController;

    @Autowired
    private WeightCheckService weightCheckService;
    @Autowired
    private ExpCheckService expCheckService;
    @Autowired
    private EnergyCheckService energyCheckService;
    @Autowired
    private LevelCheckService levelCheckService;

    @Autowired
    private CatRepository catRepository;

    @Autowired
    private CatDTO cat;

    @Autowired
    private CatEntity catEntity;

    public void playCat() {
        CatEntity catEntity = catRepository.getCatEntity(PlayerDTO.loginPlayer.getId());
        cat.setCatName(catEntity.getCatName());
        cat.setCatBreeds(catEntity.getCatBreeds());
        cat.setExp(catEntity.getExp());
        cat.setWeight(catEntity.getWeight());
        cat.setLevel(catEntity.getLevel());
        cat.setEnergy(catEntity.getEnergy());

        // 몸무게 감소 로직 {-4, -3, -2}
        // 에너지 감소 로직 {-20, -15, -10}
        switch(cat.getCatBreeds()) {
            case "코숏" : {
                catEntity.setWeight(cat.getWeight() - 0.4);
                catEntity.setEnergy(cat.getEnergy() - 20);
                cat.setWeight(cat.getWeight() - 0.4);
                cat.setEnergy(cat.getEnergy() - 20);

                catRepository.updateWeight(catEntity, PlayerDTO.loginPlayer.getId());
                break;
            }
            case "러시안블루" : {
                catEntity.setWeight(cat.getWeight() - 0.3);
                catEntity.setEnergy(cat.getEnergy() - 15);
                cat.setWeight(cat.getWeight() - 0.3);
                cat.setEnergy(cat.getEnergy() - 15);

                catRepository.updateWeight(catEntity, PlayerDTO.loginPlayer.getId());
                break;

            }
            case "노르웨이숲" : {
                catEntity.setWeight(cat.getWeight() - 0.2);
                catEntity.setEnergy(cat.getEnergy() - 10);
                cat.setWeight(cat.getWeight() - 0.2);
                cat.setEnergy(cat.getEnergy() - 10);

                catRepository.updateWeight(catEntity, PlayerDTO.loginPlayer.getId());
                break;
            }
        }

        boolean isWarningWeight = weightCheckService.checkWarningWeght(cat);
        boolean isMaxWeight = weightCheckService.checkMaxWeight(cat);
        boolean isMinWeight = weightCheckService.checkMinWeight(cat);
        boolean isLowEnergy = energyCheckService.checkEnergyLow(cat);
        boolean isZeroEnergy = energyCheckService.checkEnergyZero(cat);

        if (isWarningWeight || isLowEnergy) {
            if (isWarningWeight)
                System.out.println("경고! 고양이의 몸무게를 신경써주세요!");

            if (isLowEnergy)
                System.out.println("경고! 에너지가 30 이하입니다!");
        }
        if (isMaxWeight) {
            endingController.result(2, cat);
        }
        if (isZeroEnergy || isMinWeight) {
            endingController.result(1, cat);
        }

        // 경험치 증가 로직 {+15}
        catEntity.setExp(cat.getExp() + 15);
        cat.setExp(cat.getExp() + 15);


        boolean isEXPMax = expCheckService.checkEXPMax(cat);
        boolean isLevelMax = levelCheckService.checkLevelMax(cat);

        if ((isEXPMax) && (isLevelMax)) {
            endingController.result(3, cat);
        }
        else if ((isEXPMax) && (!isLevelMax)) {
            catEntity.setExp(0);
            catEntity.setLevel(cat.getLevel() + 1);
            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
            catRepository.updateLevel(catEntity, PlayerDTO.loginPlayer.getId());
        }
        else {
            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
        }
    }

    public void feedCat() {
        CatEntity catEntity = catRepository.getCatEntity(PlayerDTO.loginPlayer.getId());
        cat.setCatName(catEntity.getCatName());
        cat.setCatBreeds(catEntity.getCatBreeds());
        cat.setExp(catEntity.getExp());
        cat.setWeight(catEntity.getWeight());
        cat.setLevel(catEntity.getLevel());
        cat.setEnergy(catEntity.getEnergy());

        // 에너지 증가 로직 {+5}
        catEntity.setEnergy(cat.getEnergy() + 5);
        cat.setEnergy(cat.getEnergy() + 5);

        catRepository.updateEnergy(catEntity, PlayerDTO.loginPlayer.getId());

        // 몸무게 증가 로직 {+0.5}
        catEntity.setWeight(cat.getWeight() + 0.5);
        cat.setWeight(cat.getWeight() + 0.5);

        catRepository.updateWeight(catEntity, PlayerDTO.loginPlayer.getId());

        boolean isWarningWeight = weightCheckService.checkWarningWeght(cat);
        boolean isMaxWeight = weightCheckService.checkMaxWeight(cat);

        if (isWarningWeight) {
            System.out.println("경고! 고양이의 몸무게를 신경써주세요!");
        }
        if (isMaxWeight) {
            endingController.result(2, cat);
        }

        // 경험치 10 증가 로직
        catEntity.setExp(cat.getExp() + 10);
        cat.setExp(cat.getExp() + 10);

        boolean isEXPMax = expCheckService.checkEXPMax(cat);
        boolean isLevelMax = levelCheckService.checkLevelMax(cat);

        if ((isEXPMax) && (isLevelMax)) {
            endingController.result(3, cat);
        }
        else if ((isEXPMax) && (!isLevelMax)) {
            catEntity.setExp(0);
            catEntity.setLevel(cat.getLevel() + 1);
            cat.setExp(0);
            cat.setLevel(cat.getLevel()+1);

            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
            catRepository.updateLevel(catEntity, PlayerDTO.loginPlayer.getId());
        }
        else {
            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
        }
    }

    public void sleepCat() {
        CatEntity catEntity = catRepository.getCatEntity(PlayerDTO.loginPlayer.getId());
        cat.setCatName(catEntity.getCatName());
        cat.setCatBreeds(catEntity.getCatBreeds());
        cat.setExp(catEntity.getExp());
        cat.setWeight(catEntity.getWeight());
        cat.setLevel(catEntity.getLevel());
        cat.setEnergy(catEntity.getEnergy());

        // 경험치 5 증가 로직
        catEntity.setExp(cat.getExp() + 5);
        cat.setExp(cat.getExp() + 5);

        boolean isEXPMax = expCheckService.checkEXPMax(cat);
        boolean isLevelMax = levelCheckService.checkLevelMax(cat);

        if ((isEXPMax) && (isLevelMax)) {
            endingController.result(3, cat);
        }
        else if ((isEXPMax) && (!isLevelMax)) {
            catEntity.setExp(0);
            catEntity.setLevel(cat.getLevel() + 1);
            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
            catRepository.updateLevel(catEntity, PlayerDTO.loginPlayer.getId());
        }
        else {
            catRepository.updateExp(catEntity, PlayerDTO.loginPlayer.getId());
        }
    }

    public CatDTO getCat() {
        catEntity = catRepository.getCatEntity(PlayerDTO.loginPlayer.getId());
        cat.setCatName(catEntity.getCatName());
        cat.setExp(catEntity.getExp());
        cat.setLevel(catEntity.getLevel());
        cat.setEnergy(catEntity.getEnergy());
        cat.setCatBreeds(catEntity.getCatBreeds());
        cat.setWeight(catEntity.getWeight());

        return cat;
    }
}
