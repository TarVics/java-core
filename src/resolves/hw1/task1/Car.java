package resolves.hw1.task1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Getter
public class Car {
    String model;
    int power;
    Double volumeEngine;
    boolean turbo;

    public Car() {
    }
}
