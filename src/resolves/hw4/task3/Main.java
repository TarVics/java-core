package resolves.hw4.task3;

import java.util.*;
import java.util.function.Consumer;

public class Main {

    /*
        Створити клас котрий відповідає наступній моделі
        {
            id: 1,
                    name: 'vasya',
                surname: 'pupkin',
                email: 'asd@asd.com',
                age: 31,
                gender: 'MALE',
                skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
            car: {model: 'toyota', year: 2021, power: 250}
        }
        Використати композицію/агрегацію та енуми в потрібному місці.
        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
    */
    public static void fillSet(Set<User> items) {
        items.add(new User(
                1,
                "vasya1",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                List.of(
                        new Skill("java", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                2,
                "vasya2",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                3,
                "vasya3",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                4,
                "vasya4",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("python", 10),
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                5,
                "vasya5",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                6,
                "vasya6",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.FEMALE,
                List.of(
                        new Skill("java", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                7,
                "vasya7",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                List.of(
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                8,
                "vasya8",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.FEMALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("js", 10),
                        new Skill("c++", 10),
                        new Skill("pascal", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                9,
                "vasya9",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                Arrays.asList(
                        new Skill("java", 10),
                        new Skill("c#", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
        items.add(new User(
                10,
                "vasya10",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.FEMALE,
                List.of(
                        new Skill("c++", 10)
                ),
                new Car("toyota", 2021, 250)
        ));
    }


    public static void main(String[] args) {
        // Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
        HashSet<User> usersHashSet = new HashSet<>();
        fillSet(usersHashSet);
        System.out.println("HashSet: " + usersHashSet);

/*
        while (iteratorHashSet.hasNext()) {
            User user = iteratorHashSet.next();
            if (user.getGender() == Gender.MALE) {
                iteratorHashSet.remove();
            }
        }
*/

        usersHashSet.removeIf(user -> user.getGender() == Gender.MALE);
        System.out.println("Without MALE:" + usersHashSet);


        // Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
        TreeSet<User> usersTreeSet = new TreeSet<>();
        fillSet(usersTreeSet);
        // implements Comparable<User> -> compareTo(User o) -> return this.skills.size() - o.getSkills().size();
        // OR:
        System.out.println("Sorted by Skill Count:");
        usersTreeSet.stream()
                //.sorted(Comparator.comparingInt(o -> o.getSkills().size()))
                .forEach(System.out::println);
    }
}


