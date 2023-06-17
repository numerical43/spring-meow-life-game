package com.catholic.meowlife.domain.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CatEntity {
    private String catName;
    private String catBreeds;
    private int energy;
    private double weight;
    private int exp;
    private int level;
}
