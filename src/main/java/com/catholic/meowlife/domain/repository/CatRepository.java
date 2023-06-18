package com.catholic.meowlife.domain.repository;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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
    @Autowired
    PlayerDTO playerDTO;

    public void createCatInDB(String catName, String catBreeds) {
        playerEntity = new PlayerEntity("qlql", "1234", "홍길동");
        catEntity = new CatEntity(catName, catBreeds, 50, 2, 0, 1);

        CatDB.getCatMap().put(playerEntity.getId(), catEntity);
    }
  
    public void deleteCatDB(){
        CatDB.getCatMap().remove(playerDTO.getId());
    }
}
