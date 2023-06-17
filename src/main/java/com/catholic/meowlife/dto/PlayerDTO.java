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
    private boolean login;
}
