package catholic.meowlife.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class CatEntity {
    private String catName;
    private String catBreeds;
    private int energy;
    private int weight;
    private int exp;


}
