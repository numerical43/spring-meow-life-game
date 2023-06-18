package com.catholic.meowlife.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class PlayerDTO {
    private String id;
    private String pw;
    private String name;
}


//    public static PlayerDTO loginPlayer;
//
//
//    View ->
//            PlayerDTO(id ,pwd) -> PalyerEntity(id, pwd)
//
//            DB ->(성공 시)
//            PlayerEntity(모든 정보) -> PlayerDTO(모든 정보); - 반환 - -> controller -> view
//            -> loginPlayer 필드에도 담기
//
//
//
//            -> (실패)
//            실패 메시지, 실패 코드번호, boolean