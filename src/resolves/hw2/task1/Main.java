package resolves.hw2.task1;

public class Main {

    // Task1
    // створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
    // https://jsonplaceholder.typicode.com/users/1

    public static void main(String[] args) {
        // Агрегація
        Geo geo = new Geo(
                "-37.3159",
                "81.1496"
        );
        Address address = new Address(
                "Kulas Light",
                "Apt. 556",
                "Gwenborough",
                "92998-3874",
                geo
        );
        Company company = new Company(
                "Romaguera-Crona",
                "Multi-layered client-server neural-net",
                "harness real-time e-markets"
        );
        User user = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                address,
                "1-770-736-8031 x56442",
                "hildegard.org",
                company
        );
        System.out.println(user);

        // Композиція
        User user2 = new User(
                1,
                "Leanne Graham",
                "Bret",
                "Sincere@april.biz",
                "1-770-736-8031 x56442",
                "hildegard.org"
        );

        Company company1 = user2.getCompany();
        company1.setName("Romaguera-Crona");
        company1.setCatchPhrase("Multi-layered client-server neural-net");
        company1.setBs("harness real-time e-markets");

        Address address1 = user2.getAddress();
        address1.setStreet("Kulas Light");
        address1.setSuite("Kulas Light");
        address1.setCity("Gwenborough");
        address1.setZipcode("92998-3874");
        address1.setGeo(geo);
        System.out.println(user2);

    }
}


