package com.catholic.meowlife.infra.DB;

import com.catholic.meowlife.domain.entity.PlayerEntity;

import java.util.HashMap;
import java.util.Map;

public class PlayerDB {
    public static Map<String, PlayerEntity> playerMap;

    public PlayerDB() {
        playerMap = new HashMap<>();
    }
}