package com.catholic.meowlife.domain.entity;

import lombok.*;

import org.springframework.stereotype.Component;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Setter
@ToString
@Component
public class CatEntity {
    private String catName;
    private String catBreeds;
    private double weight;
    private int energy;
    private double weight;
    private int exp;
    private int level;
}

