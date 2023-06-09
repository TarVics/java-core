package resolves.hw4.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
      Створити List Юзерів
    - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
    - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
    */

    public static void main(String[] args) {
        // Створити List Юзерів
        List<User> users = new ArrayList<>();
        users.add(new User(16, "Vasya"));
        users.add(new User(26, "Den"));
        users.add(new User(23, "Ket"));
        users.add(new User(46, "Vasilisa"));

        System.out.println("Initial: " + users);

        // - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println("Sort by age ASC: " + users);

        users.sort((o1, o2) -> o2.getAge() - o1.getAge());
        System.out.println("Sort by age DESC: " + users);

        // - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
        users.sort(Comparator.comparingInt(o -> o.getName().length()));
        System.out.println("Sort by name length ASC: " + users);

        users.sort((o1, o2) -> o2.getName().length() - o1.getName().length());
        System.out.println("Sort by name length DESC: " + users);
    }
}

