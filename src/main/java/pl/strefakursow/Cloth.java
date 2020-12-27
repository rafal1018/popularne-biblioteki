package pl.strefakursow;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class Cloth {
    @Getter @Setter
    private String color;
    @Getter @Setter
    private Boolean isNew;
}
