package resolves.hw4.task4;

import lombok.Data;
import lombok.NonNull;

import java.util.ArrayList;
import java.util.List;

@Data
public class Person {
    @NonNull
    private String name;
    private List<Pet> pets = new ArrayList<>();

    @Override
    public String toString() {
        return name;
    }

    public Pet addPet(String petName) {
        Pet pet = new Pet(this, petName);
        pets.add(pet);
        return pet;
    }

    public Pet addPet(Pet pet) {
        pets.add(pet);
        return pet;
    }

    public boolean removePet(String petName) {
        return pets.removeIf(pet -> pet.getName().equals(petName));
    }

    public boolean removePet(Pet pet) {
        return pets.remove(pet);
    }

}
