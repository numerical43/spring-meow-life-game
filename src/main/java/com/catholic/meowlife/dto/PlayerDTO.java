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
    public static PlayerDTO loginPlayer;
    private String id;
    private String pw;
    private String name;
}
