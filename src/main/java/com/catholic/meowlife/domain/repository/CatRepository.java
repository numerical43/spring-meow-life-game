package com.catholic.meowlife.domain.repository;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CatRepository {

    @Autowired
    PlayerDTO playerDTO;

    public void deleteCatDB(){
        CatDB.getCatMap().remove(playerDTO.getId());
    }
}
