package az.digitalhands.oficenter.wrapper;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryWrapper {

    private Long id;
    private String name;
    private Long collectionId;

}