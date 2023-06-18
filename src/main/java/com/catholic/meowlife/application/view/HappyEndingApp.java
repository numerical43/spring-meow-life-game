package com.catholic.meowlife.application.view;

import org.springframework.beans.factory.annotation.Autowired;

public class HappyEndingApp {
    @Autowired
    CreateCatView createCatView;

    public void getName(String catName){
        System.out.println("");
        System.out.println("");
        System.out.println("!!!고양이가 LEVEL5가 되었습니다!!!");
        System.out.println("당신은 " + catName + " 키우기에 성공했습니다. 평생 함께 행복하게 사세용 ");

        System.out.println("");
        System.out.println("");

        System.out.println("⊂_ヽ                                    ");
        System.out.println("　 ＼＼  Λ＿Λ                            ");
        System.out.println("　　 ＼( 'ㅅ' )♥️                       ");
        System.out.println("　　　 >　⌒ヽ                 .....∧_∧            ");
        System.out.println("　　　/ 　 へ＼               .. ( ̳• ·̫ • ̳) ♡                 ");
        System.out.println("　　 /　　/　＼＼              ┏ー∪∪━━━━━━━━━━━━┓         ");
        System.out.println("　　 ﾚ　ノ　　 ヽ_つ               고맙소 주인!     ");
        System.out.println("　　/　/                      ┗━--━━━━━━━━━•━━━┛              ");
        System.out.println("　 /　/|                                        ");
        System.out.println("　(　(ヽ                                         ");
        System.out.println("　|　|、＼                                       ");
        System.out.println("　| 丿   ＼ ⌒)                                  ");
        System.out.println("　| |　　 ) /                                    ");
        System.out.println("(`ノ )　　Lﾉ                                     ");


        System.out.println("");

        System.out.println("      ⁜©Team CatHolic.⁜    ");

        System.out.println("");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        createCatView.createCatView();
    }
}
