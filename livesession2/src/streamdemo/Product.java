package streamdemo;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class Product {
    private Integer  id;
    private String name;
    private double price;
}
