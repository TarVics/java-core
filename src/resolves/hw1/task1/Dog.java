package resolves.hw1.task1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Getter
public class Dog {
    String name;
    int age;
    String poroda;

    public Dog() {
    }
}
