package resolves.hw5.task3;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    // Марка автомобля,
    private String mark;
    // потужність двигуна,
    private Double power;
    // ціна,
    private int price;
    // рік випуску.
    private int year;
    // власник,
    private CarOwner owner;
}
