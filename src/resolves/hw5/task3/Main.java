package resolves.hw5.task3;

import java.util.Arrays;
import java.util.List;

public class Main {

    /*
        Це абстрактне завдання, в якого ыснуэ 100500 способів вирішення, тому його
        сприймате просто як список можливих варіацій бізнес процесів.
        Вважайте, що тут нема правильної відповіді

        - Створити клас автомобіля з полями:
            Марка автомобля, потужність двигуна, власник, ціна, рік випуску.

        - Власник автомобіля теж має бути обєкт, у якого є поля
            Імя, вік, стаж водіння.

        - Створити не менше 7 та не більше 20 машинок.

        - Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10%
          (переприсвоєння змінної потужності).

        - Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси
        підвищення кваліфікації, що збільшить йому досвід на 1 рік.

        - Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
        Все через stream API
    */

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Audi", 220.0, 73000, 2021, new CarOwner("Antonina Pavlenko", 30, 11)),
                new Car("Tesla", 1500.0, 37036, 2022, new CarOwner("Milana Sokolova", 31, 12)),
                new Car("Hyundai", 160.0, 39890, 2016, new CarOwner("Alexandra Kovalenko", 23, 4)),
                new Car("Ford", 340.0, 93312, 2018, new CarOwner("Timur Vasylyk", 32, 12)),
                new Car("Mazda", 200.0, 53000, 2019, new CarOwner("Taisia Pavlenko", 40, 20)),
                new Car("Porsche", 190.0, 59103, 2021, new CarOwner("Oksana Melnyk", 42, 22)),
                new Car("Kia", 180.0, 40273, 2022, new CarOwner("Zoya Koval", 24, 5)),
                new Car("Hyundai", 160.0, 42284, 2017, new CarOwner("Mykhaylo Vasylenko", 45, 25)),
                new Car("Toyota", 140.0, 29789, 2015, new CarOwner("Alisa Rudenko", 20, 1)),
                new Car("Lexus", 370.0, 121178, 2019, new CarOwner("Vyacheslav Kolomiyets", 61, 41)),
                new Car("Nissan", 210.0, 44149, 2021, new CarOwner("Yuriy Bondarenko", 43, 23)),
                new Car("Lexus", 300.0, 90145, 2022, new CarOwner("Havryil Borisenko", 23, 4)),
                new Car("BMW", 350.0, 102360, 2016, new CarOwner("Vitaliy Netudyhata", 42, 19)),
                new Car("Honda", 260.0, 69660, 2019, new CarOwner("Alexandra Gavrilyuk", 37, 17)),
                new Car("Nissan", 170.0, 46928, 2021, new CarOwner("Susanna Shevchenko", 29, 9)),
                new Car("Lexus", 190.0, 69548, 2022, new CarOwner("Dmytro Ratchenko", 60, 40)),
                new Car("Tesla", 200.0, 67428, 2017, new CarOwner("Zlata Boyko", 46, 24)),
                new Car("Chevy", 240.0, 102064, 2019, new CarOwner("Julia Zabuzhko", 21, 2)),
                new Car("BMW", 240.0, 65034, 2017, new CarOwner("Lyubochka Onopriyenko", 63, 43)),
                new Car("BMW", 170.0, 27665, 2022, new CarOwner("Pavlo Melnychuk", 38, 18))
        );

        System.out.println("- Cars: " + cars);

        /*
            - Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10%
            (переприсвоєння змінної потужності).
        */

        cars.stream()
                .limit(cars.size() / 2)
                .forEach(car -> car.setPower(car.getPower() + car.getPower() * 0.1));
        System.out.println("- Cars with 10% power: " + cars);


        /*
            - Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
              Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси
              підвищення кваліфікації, що збільшить йому досвід на 1 рік.
        */

        cars.forEach(car -> {
            CarOwner owner = car.getOwner();
            if (owner.getExp() < 5 && owner.getAge() > 25) {
                owner.setExp(owner.getExp() + 1);
                System.out.println("- Car owner has increased new experience: " + owner);
            }
        });

        /*
            - Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
        */
        int totalPrice = cars.stream()
                .mapToInt(Car::getPrice)
                .sum();
        System.out.println("- ALL cars total price: " + totalPrice);
    }
}


