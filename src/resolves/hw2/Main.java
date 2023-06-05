package resolves.hw2;

import resolves.hw2.task1.Address;
import resolves.hw2.task1.Company;
import resolves.hw2.task1.Geo;
import resolves.hw2.task1.User;
import resolves.hw2.task2.Ultrabook;
import resolves.hw2.task2.Workstation;
import resolves.hw2.task3.Comics;
import resolves.hw2.task3.Magazine;
import resolves.hw2.task4.Car;
import resolves.hw2.task4.Gender;
import resolves.hw2.task4.Skill;
import resolves.hw2.task5.Comment;
import resolves.hw2.task5.Post;

public class Main {

    // Task1
    // створити клас, який би описував подібні об'єкти виклористовуючи композицію/агрегацію
    // https://jsonplaceholder.typicode.com/users/1
    public static void task1() {

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

    // Створити та описати наступну їєрархію
    // PC-Laptop-Ultrabook
    // PC-Laptop-Workstation
    // Загальна кількість вкористаних класів - 4!
    public static void task2() {
        Workstation ws = new Workstation();
        Ultrabook ub = new Ultrabook();

        System.out.println(ws);
        System.out.println(ub);
    }

    // Cтворити клас ланцюг наслідування:
    // Папірус-Кинга-Журнал
    // Папірус-Книга-Комікс
    // Кількість полів довільна.
    public static void task3() {
        Magazine mz = new Magazine(10, 15, 20, 125, 6);
        Comics cs = new Comics(15, 20, 25, 60, "Superman");

        System.out.println(mz);
        System.out.println(cs);
    }

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
    */
    public static void task4() {
        Skill[] skills = {
                new Skill("java", 10),
                new Skill("js", 10),
                new Skill("c++", 10)
        };

        Car car = new Car("toyota", 2021, 250);

        resolves.hw2.task4.User user = new resolves.hw2.task4.User(
                1,
                "vasya",
                "pupkin",
                "asd@asd.com",
                31,
                Gender.MALE,
                skills,
                car
        );

        System.out.println(user);
    }

    /*
    ***Additional***
    Є об'єкти постів:
    {
    "userId": 1,
    "id": 1,
    "title": "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
    "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
    },
    {
    "userId": 1,
    "id": 2,
    "title": "qui est esse",
    "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
    },
    {
    "userId": 1,
    "id": 3,
    "title": "ea molestias quasi exercitationem repellat qui ipsa sit aut",
    "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
    }

    Є об'єкти коментарів до цих постів
    {
    "postId": 1,
    "id": 1,
    "id labore ex et quam laborum",
    "Eliseo@gardner.biz",
    "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
    },
    {
    "postId": 1,
    "id": 2,
    "quo vero reiciendis velit similique earum",
    "Jayne_Kuhic@sydney.com",
    "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"
    },
    {
    "postId": 1,
    "id": 3,
    "odio adipisci rerum aut animi",
    "Nikita@garfield.biz",
    "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"
    },

    {
    "postId": 2,
    "id": 7,
    "repellat consequatur praesentium vel minus molestias voluptatum",
    "Dallas@ole.me",
    "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"
    },
    {
    "postId": 2,
    "id": 8,
    "et omnis dolorem",
    "Mallory_Kunze@marie.org",
    "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"
    }


    {
    "postId": 3,
    "id": 13,
    "aut inventore non pariatur sit vitae voluptatem sapiente",
    "Kariane@jadyn.tv",
    "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
    },
    {
    "postId": 3,
    "id": 14,
    "et officiis id praesentium hic aut ipsa dolorem repudiandae",
    "Nathan@solon.io",
    "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
    },
    {
    "postId": 3,
    "id": 15,
    "debitis magnam hic odit aut ullam nostrum tenetur",
    "Maynard.Hodkiewicz@roberta.com",
    "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
    },

    Запакувати всі пости в список,всі коментарі в свій окремий список
    Проітерувати списки, і додати коментар з відповідним ід до відповідного поста

    В постах додатково потрібно додати поле яке характеризує список комментарів.


    */
    public static void task5() {
        Post[] posts = {
            new Post(
                1,
                1,
                "sunt aut facere repellat provident occaecati excepturi optio reprehenderit",
                "quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto"
            ),
            new Post(
                1,
                2,
                "qui est esse",
                "est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla"
            ),
            new Post(
                1,
                3,
                "ea molestias quasi exercitationem repellat qui ipsa sit aut",
                "et iusto sed quo iure\nvoluptatem occaecati omnis eligendi aut ad\nvoluptatem doloribus vel accusantium quis pariatur\nmolestiae porro eius odio et labore et velit aut"
            )
        };

        Comment[] comments = {
            new Comment(
                1,
                1,
                "id labore ex et quam laborum",
                "Eliseo@gardner.biz",
                "laudantium enim quasi est quidem magnam voluptate ipsam eos\ntempora quo necessitatibus\ndolor quam autem quasi\nreiciendis et nam sapiente accusantium"
            ),
            new Comment(
                1,
                2,
                "quo vero reiciendis velit similique earum",
                "Jayne_Kuhic@sydney.com",
                "est natus enim nihil est dolore omnis voluptatem numquam\net omnis occaecati quod ullam at\nvoluptatem error expedita pariatur\nnihil sint nostrum voluptatem reiciendis et"
            ),
            new Comment(
                1,
                3,
                "odio adipisci rerum aut animi",
                "Nikita@garfield.biz",
                "quia molestiae reprehenderit quasi aspernatur\naut expedita occaecati aliquam eveniet laudantium\nomnis quibusdam delectus saepe quia accusamus maiores nam est\ncum et ducimus et vero voluptates excepturi deleniti ratione"
            ),
            new Comment(
                2,
                7,
                "repellat consequatur praesentium vel minus molestias voluptatum",
                "Dallas@ole.me",
                "maiores sed dolores similique labore et inventore et\nquasi temporibus esse sunt id et\neos voluptatem aliquam\naliquid ratione corporis molestiae mollitia quia et magnam dolor"
            ),
            new Comment(
                2,
                8,
                "et omnis dolorem",
                "Mallory_Kunze@marie.org",
                "ut voluptatem corrupti velit\nad voluptatem maiores\net nisi velit vero accusamus maiores\nvoluptates quia aliquid ullam eaque"
            ),
            new Comment(
                3,
                13,
                "aut inventore non pariatur sit vitae voluptatem sapiente",
                "Kariane@jadyn.tv",
                "fuga eos qui dolor rerum\ninventore corporis exercitationem\ncorporis cupiditate et deserunt recusandae est sed quis culpa\neum maiores corporis et"
            ),
            new Comment(
                3,
                14,
                "et officiis id praesentium hic aut ipsa dolorem repudiandae",
                "Nathan@solon.io",
                "vel quae voluptas qui exercitationem\nvoluptatibus unde sed\nminima et qui ipsam aspernatur\nexpedita magnam laudantium et et quaerat ut qui dolorum"
            ),
            new Comment(
                3,
                15,
                "debitis magnam hic odit aut ullam nostrum tenetur",
                "Maynard.Hodkiewicz@roberta.com",
                "nihil ut voluptates blanditiis autem odio dicta rerum\nquisquam saepe et est\nsunt quasi nemo laudantium deserunt\nmolestias tempora quo quia"
            )
        };

        for (Post post : posts) {
            for (Comment comment: comments) {
                if (comment.getPostId() == post.getId()) {
                    post.getComments().add(comment);
                }
            }
            System.out.println("********************************************************");
            System.out.println(post);
        }

    }

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }
}
