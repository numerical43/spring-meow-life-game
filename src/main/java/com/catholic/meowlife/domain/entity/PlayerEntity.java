package com.catholic.meowlife.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class PlayerEntity {
    private String id;
    private String pw;
    private String name;
    private boolean login;
}