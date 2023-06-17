package com.catholic.meowlife.domain.service;
import com.catholic.meowlife.dto.PlayerDTO;
import com.catholic.meowlife.infra.DB.PlayerDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class IdCheckService {

    @Autowired
    PlayerDB playerDB;
    public boolean checkDuplicateId(PlayerDTO playerDTO){
        String playerId = playerDTO.getId();

        boolean isDuplicate = playerDB.getPlayerMap().values()
                .stream()
                .anyMatch(playerEntity -> playerEntity.getId().equals(playerId));

        if(isDuplicate == true) {
            throw new IllegalArgumentException("중복되는 아이디가 존재합니다.");
        }
        return true;
    }

    public boolean checkCorrectId(PlayerDTO playerDTO){
        String id = playerDTO.getId();
        if(!id.matches("^[a-zA-Z0-9]+$")){
            throw new IllegalArgumentException("아이디는 영문/숫자로만 입력해주세요");
        }
        return true;
    }

    public boolean checkCorrectPw(PlayerDTO playerDTO){
        String pw = playerDTO.getPw();
        if(!pw.matches("^[a-zA-Z0-9]+$")){
            throw new IllegalArgumentException("비밀번호는 영문/숫자로만 입력해주세요");
        }
        return true;
    }

    public boolean checkIdLength(PlayerDTO playerDTO) {
        String id = playerDTO.getId();
        if(id.length() < 5 || id.length() > 20){
            throw new IllegalArgumentException("아이디는 5~20자 사이로 입력해주세요");
        }
        return true;
    }

    public boolean checkPwLength(PlayerDTO playerDTO) {
        String pw = playerDTO.getPw();
        if(pw.length() < 5 || pw.length() > 20){
            throw new IllegalArgumentException("비밀번호는 5~20자 사이로 입력해주세요");
        }
        return true;
    }

}