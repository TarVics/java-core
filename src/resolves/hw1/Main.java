package resolves.hw1;

public class Main {
    public static void main(String[] args) {
        String[] authors = {"John Doe"};
        Book book = new Book("Title", 100, "Genre", authors);
        System.out.println("1. " + book + "\n");

        Car car = new Car("Mode", 125, 3.5, true);
        System.out.println("2. " + car + "\n");

        Dog dog = new Dog("Name", 10, "Poroda");
        System.out.println("3. " + dog + "\n");

        Post post = new Post(
                1,
                1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
        );
        System.out.println("4. " + post + "\n");

        Comment comment = new Comment(
                1,
                1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
        );

        System.out.println("5. " + comment + "\n");

    }
}
