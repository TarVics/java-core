package resolves.hw4.task2;

import java.util.ArrayList;

public class Main {

    /*
      створити ArrayList зі словами на 15-20 елементів.
    - відсортувати його за алфавітом .
    */

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("research");
        words.add("remedy");
        words.add("holiday");
        words.add("pole");
        words.add("engagement");
        words.add("nuance");
        words.add("bowel");
        words.add("deficit");
        words.add("soldier");
        words.add("choice");
        words.add("chop");
        words.add("leash");
        words.add("respect");
        words.add("file");
        words.add("exclude");
        words.add("road");
        words.add("health");
        words.add("change");
        words.add("concentrate");
        words.add("drawing");

        System.out.println("Unsorted words: " + words);

        words.sort(String::compareTo);
        System.out.println("Sorted words: " + words);

    }
}
