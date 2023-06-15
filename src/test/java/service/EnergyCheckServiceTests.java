package service;



import catholic.meowlife.application.controller.EndingController;
import catholic.meowlife.config.ContextConfiguration;
import com.catholic.meowlife.domain.entity.CatEntity;
import com.catholic.meowlife.domain.entity.PlayerEntity;
import com.catholic.meowlife.infra.DB.CatDB;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import repository.CatRepository;

import java.util.Map;


@SpringJUnitConfig(classes = {ContextConfiguration.class})
public class EnergyCheckServiceTests {

    @Autowired
    CatRepository catRepository;

    @Autowired
    EndingController endingController;


//    @DisplayName("밥 먹기 선택 시, 에너지가 5 증가하는지 확인")
//    @Test
//    public void eatCat(){
//        PlayerEntity player = new PlayerEntity("qlqlzbxkzl", "1234","홍길동",false);
//        PlayerEntity player2 = new PlayerEntity("dsadsa", "1234","유관순",true);
//
//        CatEntity cat = new CatEntity("미로","코숏",60,2, 1);
//        CatEntity cat2 = new CatEntity("초코","러시안 블루",0,2, 1);
//
//        PlayerDB.playerMap.put(player.getName(), player);
//        PlayerDB.playerMap.put(player2.getName(), player);
//
//        CatDB.catMap.put(player, cat);
//        CatDB.catMap.put(player2,cat2);
//
//
//        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()) {
//            PlayerEntity playerEntity = playerCatEntry.getKey();
//            CatEntity catEntity = playerCatEntry.getValue();
//
//            if (playerEntity.isLogin()) {
//                int beforeEnergy = catEntity.getEnergy();
//                int eatEnergy = catEntity.getEnergy() + 5;
//                eatEnergy = (eatEnergy >= 100) ? 100 : eatEnergy;
//                catRepository.updateInDB(eatEnergy);
//
//                System.out.println("먹기 전 에너지 = " + beforeEnergy);
//                System.out.println("먹기 이후 에너지 = " + eatEnergy);
//            }
//        }
//        System.out.println("에너지 변경됐는지 확인 = " + cat.getEnergy());
//    }
//
//
//    @DisplayName("잠자기 선택 시, 에너지가 10 증가하는지 확인")
//    @Test
//    public void sleepCat(){
//        PlayerEntity player = new PlayerEntity("qlqlzbxkzl", "1234","홍길동",false);
//        PlayerEntity player2 = new PlayerEntity("dsadsa", "1234","유관순",true);
//
//        CatEntity cat = new CatEntity("미로","코숏",60,2, 1);
//        CatEntity cat2 = new CatEntity("초코","러시안 블루",0,2, 1);
//
//        PlayerDB.playerMap.put(player.getName(), player);
//        PlayerDB.playerMap.put(player2.getName(), player);
//
//
//        CatDB.catMap.put(player, cat);
//        CatDB.catMap.put(player2,cat2);
//
//        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()){
//            PlayerEntity playerEntity = playerCatEntry.getKey();
//            CatEntity catEntity = playerCatEntry.getValue();
//
//            if (playerEntity.isLogin()) {
//                int beforeEnergy = catEntity.getEnergy();
//                int sleepEnergy = catEntity.getEnergy() + 10;
//                sleepEnergy = (sleepEnergy >= 100) ? 100 : sleepEnergy;
//                catRepository.updateInDB(sleepEnergy);
//
//                System.out.println("잠자기 전 에너지 = " + beforeEnergy);
//                System.out.println("잠자기 이후 에너지 = " + sleepEnergy);
//            }
//        }
//        System.out.println("에너지 변경됐는지 확인 = " + cat.getEnergy());
//    }

    @DisplayName("놀기 선택 시, 종에 따라 에너지가 정상적으로 감소하는지 확인")
    @Test
    public void playCat() {
        PlayerEntity player = new PlayerEntity("qlqlzbxkzl", "1234","이길동",false);
        PlayerEntity player2 = new PlayerEntity("dsadsa", "1234","오관순",true);
        PlayerEntity player3 = new PlayerEntity("qwew", "1234","고길동",false);

        CatEntity cat = new CatEntity("미로","코숏",60,2, 1);
        CatEntity cat2 = new CatEntity("초코","러시안 블루",0,2, 1);
        CatEntity cat3 = new CatEntity("두부","노르웨이 숲",100,2, 1);

        PlayerDB.playerMap.put(player.getName(), player);
        PlayerDB.playerMap.put(player2.getName(), player);
        PlayerDB.playerMap.put(player3.getName(), player);

        CatDB.catMap.put(player, cat);
        CatDB.catMap.put(player2, cat2);
        CatDB.catMap.put(player3,cat3);

        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()) {
            PlayerEntity playerEntity = playerCatEntry.getKey();
            CatEntity catEntity = playerCatEntry.getValue();

            if (playerEntity.isLogin() && "코숏".equals(catEntity.getCatBreeds())) {
                int beforeEnergy = catEntity.getEnergy();
                int koShortEnergy = catEntity.getEnergy() - 20;
                koShortEnergy = (koShortEnergy <= 0) ? 0 : koShortEnergy;

                catRepository.updateInDB(koShortEnergy);


                System.out.println("코숏 놀기 전 에너지 = " + beforeEnergy);
                System.out.println("코숏 놀기 이후 에너지 = " + koShortEnergy);
            }

            if (playerEntity.isLogin() && "러시안 블루".equals(catEntity.getCatBreeds())) {
                int beforeEnergy = catEntity.getEnergy();
                int russianBlueEnergy = catEntity.getEnergy() - 15;
                russianBlueEnergy = (russianBlueEnergy <= 0) ? 0 : russianBlueEnergy;
                catRepository.updateInDB(russianBlueEnergy);


                System.out.println("러시안 블루 놀기 전 에너지 = " + beforeEnergy);
                System.out.println("러시안 블루 놀기 이후 에너지 = " + russianBlueEnergy);
            }

            if (playerEntity.isLogin() && "노르웨이 숲".equals(catEntity.getCatBreeds())) {
                int beforeEnergy = catEntity.getEnergy();
                int NorForestEnergy = catEntity.getEnergy() - 10;
                NorForestEnergy = (NorForestEnergy <= 0) ? 0 : NorForestEnergy;
                catRepository.updateInDB(NorForestEnergy);

                System.out.println("노르웨이 숲 놀기 전 에너지 = " + beforeEnergy);
                System.out.println("노르웨이 숲 놀기 이후 에너지 = " + NorForestEnergy);
            }
        }
        System.out.println("에너지 변경됐는지 확인 = " + cat.getEnergy());

    }

    @DisplayName("에너지가 0이 되었을때 엔딩 컨트롤러로 이동하여 배드엔딩1 메소드를 호출하는지 확인")
    @Test
    public void testCheckEnding(){
        PlayerEntity player = new PlayerEntity("qlqlzbxkzl", "1234","홍길동",false);
        PlayerEntity player2 = new PlayerEntity("dsadsa", "1234","유관순",true);

        CatEntity cat = new CatEntity("미로","코숏",60,2, 1);
        CatEntity cat2 = new CatEntity("초코","러시안 블루",0,2, 1);

        PlayerDB.playerMap.put(player.getName(), player);
        PlayerDB.playerMap.put(player2.getName(), player);

        CatDB.catMap.put(player, cat);
        CatDB.catMap.put(player2,cat2);


        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()) {
            PlayerEntity playerEntity = playerCatEntry.getKey();
            CatEntity catEntity = playerCatEntry.getValue();

            if (playerEntity.isLogin() && catEntity.getEnergy() == 0) {
                int energy = catEntity.getEnergy();
                catRepository.updateInDB(energy);
                endingController.badEnding1();
            }
        }
    }

    @DisplayName("에너지가 30 이하일때 경고 출력하는지 확인")
    @Test
    public void testWarningEnergy(){
        PlayerEntity player = new PlayerEntity("qlqlzbxkzl", "1234","홍길동",false);
        PlayerEntity player2 = new PlayerEntity("dsadsa", "1234","유관순",true);

        CatEntity cat = new CatEntity("미로","코숏",60,2, 1);
        CatEntity cat2 = new CatEntity("초코","러시안 블루",0,2, 1);

        PlayerDB.playerMap.put(player.getName(), player);
        PlayerDB.playerMap.put(player2.getName(), player);

        CatDB.catMap.put(player, cat);
        CatDB.catMap.put(player2,cat2);


        for (Map.Entry<PlayerEntity, CatEntity> playerCatEntry : CatDB.catMap.entrySet()) {
            PlayerEntity playerEntity = playerCatEntry.getKey();
            CatEntity catEntity = playerCatEntry.getValue();

            if (playerEntity.isLogin() && catEntity.getEnergy() <= 30) {
                int nowEnergy = catEntity.getEnergy();
                System.out.print("현재 고양이의 에너지가 30 이하 입니다!! ");
                System.out.println("현재 고양이의 에너지는 " + nowEnergy + " 입니다!");
            }
        }
    }


    public void checkEnding(int energy){
        if(energy == 0) {
            endingController.badEnding1();
        }
    }

    public void warningEnergy(int energy){
        if(energy <= 30){
            System.out.println("에너지가 30 이하 입니다!!");
        }
    }

}