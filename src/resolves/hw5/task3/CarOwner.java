package resolves.hw5.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CarOwner {
    // Імя,
    private String name;
    // вік,
    private int age;
    // стаж водіння.
    private int exp;
}
