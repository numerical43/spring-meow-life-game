package com.catholic.meowlife.domain.service;
import com.catholic.meowlife.dto.PlayerDTO;
import org.springframework.stereotype.Component;

@Component
public class IdCheckService {
    public void checkDuplicateId(PlayerDTO playerDTO){

    }

    public boolean checkCorrectId(PlayerDTO playerDTO){
        String id = playerDTO.getId();
        try{
            if(!id.matches("^[a-zA-Z0-9]+$")){
                throw new IllegalArgumentException("영문/숫자로만 입력해주세요");
            }
        } catch(Exception e){
            System.out.println("영문/숫자로만 입력해주세요");
            e.getMessage();
            e.printStackTrace();
        }
        return true;
    }

    public boolean checkIdLength(PlayerDTO playerDTO) {
        String id = playerDTO.getId();
        try{
            if(id.length() < 5 || id.length() > 20){
                throw new IllegalArgumentException("아이디: 5~20자 사이로 입력해주세요");
            }
        } catch(Exception e){
            System.out.println("아이디: 5~20자 사이로 입력해주세요");
            e.getMessage();
            e.printStackTrace();
        }
        return true;
    }

    public boolean checkPwLength(PlayerDTO playerDTO) {
        String pw = playerDTO.getPw();
        try{
            if(pw.length() < 5 || pw.length() > 20){
                throw new IllegalArgumentException("비밀번호: 5~20자 사이로 입력해주세요");
            }
        } catch(Exception e){
            System.out.println("비밀번호: 5~20자 사이로 입력해주세요");
            e.getMessage();
            e.printStackTrace();
        }
        return true;
    }

}