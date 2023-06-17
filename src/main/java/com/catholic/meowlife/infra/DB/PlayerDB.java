package com.catholic.meowlife.infra.DB;

import com.catholic.meowlife.domain.entity.PlayerEntity;

import java.util.HashMap;
import java.util.Map;

import java.util.Map;

public class PlayerDB {
    private static Map<String, PlayerEntity> playerMap = new HashMap<>();

    public static Map<String, PlayerEntity> getPlayerMap() {
        return playerMap;
    }
}