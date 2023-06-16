package com.catholic.meowlife.dto;

import com.catholic.meowlife.domain.entity.CatEntity;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
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
    private int weight;
    private int exp;
    private int level;
}
