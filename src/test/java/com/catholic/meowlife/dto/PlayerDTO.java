package com.catholic.meowlife.dto;

import com.catholic.meowlife.domain.entity.PlayerEntity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    private boolean login;
}
