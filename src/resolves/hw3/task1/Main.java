package resolves.hw3.task1;

public class Main {
    /*
        а) Определить интерфейс Printable, содержащий метод void print().
        б) Определить класс Book, реализующий интерфейс Printable.
        в) Определить класс Magazine, реализующий интерфейс Printable.
        г) Создать массив типа Printable, который будет содержать книги и журналы.
    */
    public static void main(String[] args) {

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
}
