package repository;


import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.infra.DB.CatDB;
import org.springframework.stereotype.Repository;

import java.util.Map;

@Repository
public class CatRepository {
    // 에너지 DB 업데이트
    public void updateInDB(int statistics){
        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()){
            CatEntity catEntity = playerCatEntry.getValue();
            catEntity.updateEnergy(statistics);
        }
    }
}
