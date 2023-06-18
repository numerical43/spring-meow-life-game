package com.catholic.meowlife.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

    @AllArgsConstructor
    @NoArgsConstructor
    @Getter
    @ToString
    public class CatDTO {
        private String catName;
        private String catBreeds;
        private int energy;
        private double weight;
        private int exp;
        private int level;
    }
