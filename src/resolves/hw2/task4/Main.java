package resolves.hw2.task4;

public class Main {

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
    public static void main(String[] args) {
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
}


