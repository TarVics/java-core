package resolves.hw3;


import resolves.hw3.task1.Book;
import resolves.hw3.task1.Magazine;
import resolves.hw3.task1.Printable;
import resolves.hw3.task2.Drum;
import resolves.hw3.task2.Guitar;
import resolves.hw3.task2.Instrument;
import resolves.hw3.task2.Tube;


public class Main {

/*
    а) Определить интерфейс Printable, содержащий метод void print().
    б) Определить класс Book, реализующий интерфейс Printable.
    в) Определить класс Magazine, реализующий интерфейс Printable.
    г) Создать массив типа Printable, который будет содержать книги и журналы.
*/

    public static void task1() {
        Printable[] printable = {
            new Book("Lewis Carroll", "Alice's Adventures in Wonderland"),
            new Book("Jennifer Ballow", "Under My Pillow"),
            new Book("Aurora S Frost", "Welcome to Cripley Hollow"),
            new Magazine("National Geographic", "National Geographic Little Kids"),
            new Magazine("Zoobooks", "Zootles"),
            new Magazine("Cricket Media", "Ladybug")
        };

        for (Printable item : printable) {
            item.print();
            System.out.println("---------------------");
        }
    }

/*
    Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
    Интерфейс Инструмент содержит метод play()
    Гитара содержит переменные класса количествоСтрун,
    Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
    В цикле вызвать метод play() для каждого инструмента,
    который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
*/

    public static void task2() {
        Instrument[] instruments = {
            new Guitar(7),
            new Drum(35),
            new Tube(5),
            new Guitar(17),
            new Drum(135),
            new Tube(50)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
    }
}
