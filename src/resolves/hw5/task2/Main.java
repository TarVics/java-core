package resolves.hw5.task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    /*
        - Створити масив з 20 числами.
        - за допомогою способу sorted відсортувати масив.
        -- за допомогою filter отримати числа кратні 3
        -- за допомогою filter отримати числа кратні 10
        -- перебрати (проітерувати) масив за допомогою foreach()
        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
    */
    public static void main(String[] args) {
        Integer[] numbers = {540, 164, 385, 706, 149, 150, 180, 521, 151, 166, 221, 127, 712, 940, 39, 961, 475, 584, 709, 606};
        System.out.println(" - Numbers: " + Arrays.toString(numbers));

        List<Integer> list = Arrays.asList(numbers);

        List<Integer> sortedList = list.stream().sorted(Comparator.comparingInt(o -> o)).toList();
        System.out.println(" - Sorted numbers: " + sortedList);

        List<Integer> multiple3List = list.stream().filter(integer -> integer % 3 == 0).toList();
        System.out.println(" - Numbers that are multiples of 3: " + multiple3List);

        List<Integer> multiple10List = list.stream().filter(integer -> integer % 10 == 0).toList();
        System.out.println(" - Numbers that are multiples of 10: " + multiple10List);

        System.out.println(" - Foreach iteration:");
        list.forEach(integer -> System.out.print("{" + integer + "} "));
        System.out.println();

        Object[] threeTimeLagerArray = list.stream().map(integer -> integer * 3).toArray();
        System.out.println(" - 3 times larger values array: " + Arrays.toString(threeTimeLagerArray));
    }

}
