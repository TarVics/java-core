package resolves.hw4.task4;

import lombok.NoArgsConstructor;

import java.util.*;

@NoArgsConstructor
public class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    // 1) додати учасника в клуб;
    public Person addPerson(Person person) {
        club.put(person, person.getPets());
        return person;
    }

    public Person addPerson(String personName) {
        return addPerson(new Person(personName));
    }

    public Person getPerson(String personName) {
        return club
                .keySet()
                .stream()
                .filter(person -> personName.equals(person.getName()))
                .findFirst()
                .orElse(null);
    }

    // 2) додати тваринку до учасника клубу.
    public Pet addPet(Person person, Pet pet) {
        return person.addPet(pet);
    }

    public Pet addPet(Person person, String petName) {
        return person.addPet(petName);
    }

    // 3) видалити тваринку з власника.
    public boolean removePet(Person person, Pet pet) {
        return person.removePet(pet);
    }

    public boolean removePet(Person person, String petName) {
        return person.removePet(petName);
    }

    // 4) видалити учасника клубу.
    public boolean removePerson(Person person) {
        return club.remove(person) != null;
    }

    public boolean removePerson(String personName) {
        return club.entrySet().removeIf(entry -> entry.getKey().getName().equals(personName));
    }

    // 5) видалити конкретну тваринку з усіх власників.
    public boolean removePet(Pet pet) {
        final boolean[] result = { false };

//        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
//            Person person = entry.getKey();
//            result[0] |= person.removePet(pet);
//        }

        club.values().forEach(list -> result[0] |= list.remove(pet));

        return result[0];
    }

    public boolean removePet(String petName) {
        final boolean[] result = { false };

//        for (Map.Entry<Person, List<Pet>> entry : club.entrySet()) {
//            Person person = entry.getKey();
//            result[0] |= person.removePet(petName);
//        }

        club.values().forEach(list ->
            result[0] |= list.removeIf(pet -> petName.equals(pet.getName())));

        return result[0];
    }

    // 6) вивести на екран зооклуб.
    public void writeInfo() {
        System.out.println("-------------------");
        System.out.println("ZooClub:");
        club.keySet().stream()
                .sorted(Comparator.comparing(Person::getName))
                .forEach((person) -> {
                    System.out.println("-------------------");
                    System.out.println("Person: " + person);
                    System.out.println("Pets:");
                    person.getPets().forEach(System.out::println);
                });
    }

}
