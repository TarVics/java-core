package resolves.hw1.task1;

public class Main {

    /*
        закінчити опис класів Car,Dog,Book
    */
    public static void main(String[] args) {
        String[] authors = {"John Doe"};
        Book book = new Book("Title", 100, "Genre", authors);
        System.out.println("1. " + book + "\n");

        Car car = new Car("Mode", 125, 3.5, true);
        System.out.println("2. " + car + "\n");

        Dog dog = new Dog("Name", 10, "Poroda");
        System.out.println("3. " + dog + "\n");
    }
}
