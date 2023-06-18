package com.catholic.meowlife.dto;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class CatDTO {
    private String catName;
    private String catBreeds;
    private int energy;
    private double weight;
    private int exp;
    private int level;
}
