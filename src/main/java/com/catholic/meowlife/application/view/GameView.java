package com.catholic.meowlife.application.view;

import com.catholic.meowlife.application.controller.GameController;
import com.catholic.meowlife.dto.CatDTO;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

@Component
public class GameView {

    @Autowired
    private GameController gameController;


    public void gameView() {
        boolean exit = false;

        // 9를 입력할 때까지 입력 반복 -> 계속 게임 진행
        while(!exit) {
            try {
                // 고양이 출력
                CatDTO cat = gameController.getCat();

                // 고양이 정보 출력
                System.out.println("");
                System.out.println("");
                System.out.println("종 : " + cat.getCatBreeds() + "     이름 : " + cat.getCatName());
                System.out.println("레벨 : " + cat.getLevel() + "     경험치 : " + cat.getExp());
                System.out.println("몸무게 : " + cat.getWeight() + "   에너지 : " + cat.getEnergy());
                System.out.println("");
                System.out.println(" ∧_∧");
                System.out.println("(･ω･ )");
                System.out.println(" と＿⌒))");
                System.out.println("　　(_ﾉﾉ");
                System.out.println("");
                System.out.println("숫자를 입력하여 고양이의 행동을 정해주세요!");
                System.out.print("[1] 잠자기   [2] 밥먹기   [3] 놀기 : ");

                Scanner scanner = new Scanner(new InputStreamReader(System.in));
                int input = scanner.nextInt();
                scanner.nextLine();

                exit = gameController.gameSelect(input);

            }
            catch (InputMismatchException e) {
                System.out.println(e.getMessage().toString());
            }
        }
    }
}
