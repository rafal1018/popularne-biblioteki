package pl.strefakursow;

import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ExampleModel {
    @Getter @Setter
    private String hairColor;
    @Getter @Setter
    private int height;
    @Getter @Setter
    private int width;
    @Getter @Setter
    private boolean isMale;
    @Getter @Setter
    private int age;
    @Getter @Setter
    private List<Cloth> cloths;
}
