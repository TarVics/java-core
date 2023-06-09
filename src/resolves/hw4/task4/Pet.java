package resolves.hw4.task4;

import lombok.Data;
import lombok.NonNull;

@Data
public class Pet {
    @NonNull private Person person;
    @NonNull private String name;

    public boolean remove() {
        return person.removePet(this);
    }

    @Override
    public String toString() {
        return name;
    }
}
