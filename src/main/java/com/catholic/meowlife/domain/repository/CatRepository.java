package com.catholic.meowlife.domain.repository;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("catRepository")
public class CatRepository {

    @Autowired
    private CatDB catDB;

    @Autowired
    private CatEntity catEntity;

    public CatEntity getCatEntity(String playerName) {
        catEntity = CatDB.getCatMap().get(playerName);
        return catEntity;
    }

    public void updateWeight(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateEnergy(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateExp(CatEntity catEntity , String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void updateLevel(CatEntity catEntity, String id) {
        CatDB.getCatMap().put(id, catEntity);
    }

    public void setCatDB(String playerId, CatEntity catEntity) {
        CatDB.getCatMap().put(playerId, catEntity);
    }

}
