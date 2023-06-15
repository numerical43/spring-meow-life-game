package infra.DB;

import catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;

import java.util.HashMap;
import java.util.Map;

public class CatDB {
    public static Map<PlayerEntity, CatEntity> catMap = new HashMap<>();
}
