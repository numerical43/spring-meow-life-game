package com.catholic.meowlife.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CatDTO {
    private String catName;
    private String catBreeds;
    private double weight;
    private int energy;
    private int exp;
    private int level;
}
