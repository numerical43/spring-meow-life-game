package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.infra.DB.CatDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CatRepository {
    @Autowired
    CatEntity catEntity;
    @Autowired
    PlayerEntity playerEntity;

    public void createCatInDB(String catName, String catBreeds) {
        playerEntity = new PlayerEntity("qlql", "1234", "홍길동");
        catEntity = new CatEntity(catName, catBreeds, 50, 2, 0, 1);

        CatDB.getCatMap().put(playerEntity.getId(), catEntity);
    }
}
