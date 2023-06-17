package com.catholic.meowlife.domain.entity;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CatEntity {
    private String catName;
    private String catBreeds;
    private double weight;
    private int energy;
    private int exp;
    private int level;
}
