package com.catholic.meowlife.infra.DB;

import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;

import java.util.HashMap;
import java.util.Map;

public class CatDB {
    private static Map<String, CatEntity> catMap = new HashMap<>();

    public static Map<String, CatEntity> getCatMap() {
        return catMap;
    }
}
