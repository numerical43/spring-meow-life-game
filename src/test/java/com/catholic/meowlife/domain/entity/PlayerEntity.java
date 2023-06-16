package com.catholic.meowlife.domain.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class PlayerEntity {
    private String id;
    private String pw;
    private String name;
    private boolean login;
}