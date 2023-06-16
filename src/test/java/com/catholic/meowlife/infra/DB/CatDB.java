package com.catholic.meowlife.infra.DB;


import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CatDB {
    private static Map<PlayerEntity, CatEntity> catMap = new HashMap<>();

    public static Map<PlayerEntity, CatEntity> getCatMap() {
        return catMap;
    }
}
