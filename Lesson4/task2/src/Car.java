import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Car {
    private String model;
    private int year;
    @EqualsAndHashCode.Include
    private int quantity;
    private String brand;
    private String color;
    private double price;
}
