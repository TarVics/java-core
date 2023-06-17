package resolves.hw5.task1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /*
        створити ArrayList зі словами на 15-20 елементів.
        - відсортувати його за алфавітом .
        *-- відфільтрувати слова довжиною менше 4 символів
    */
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>();
        wordList.add("can");
        wordList.add("golf");
        wordList.add("pie");
        wordList.add("asset");
        wordList.add("nun");
        wordList.add("cater");
        wordList.add("carry");
        wordList.add("ready");
        wordList.add("cover");
        wordList.add("mercy");
        wordList.add("win");
        wordList.add("blank");
        wordList.add("bless");
        wordList.add("fever");
        wordList.add("sun");
        wordList.add("pass");
        wordList.add("size");
        wordList.add("row");
        wordList.add("pig");
        wordList.add("poll");
        System.out.println("Unsorted list: " + wordList);

        wordList.sort(String::compareTo);
        System.out.println("Sorted list: " + wordList);

        List<String> shortWords = wordList.stream().filter(s -> s.length() < 4).toList();
        System.out.println("List of words having length less than 4: " + shortWords);
    }
}
