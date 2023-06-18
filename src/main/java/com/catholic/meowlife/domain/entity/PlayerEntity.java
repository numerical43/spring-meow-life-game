package com.catholic.meowlife.domain.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PlayerEntity {
    private String id;
    private String pw;
    private String name;
}