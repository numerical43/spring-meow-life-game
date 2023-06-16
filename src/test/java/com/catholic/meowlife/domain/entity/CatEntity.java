package com.catholic.meowlife.domain.entity;

import lombok.*;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Component
public class CatEntity {
    private String catName;
    private String catBreeds;
    private int energy;
    private int weight;
    private int exp;
    private int level;
}
