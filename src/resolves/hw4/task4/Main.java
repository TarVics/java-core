package resolves.hw4.task4;

public class Main {
    /*
        Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List<Pet>> club;
        В зооклубі створити методи, та застосувати їх

        1) додати учасника в клуб;
        2) додати тваринку до учасника клубу.
        3) видалити тваринку з власника.
        4) видалити учасника клубу.
        5) видалити конкретну тваринку з усіх власників.
        6) вивести на екран зооклуб.

        Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
        Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку
    */
    public static void main(String[] args) {
        ZooClub club = new ZooClub();

        Person person1 = club.addPerson("Person 1");
        Person person2 = club.addPerson("Person 2");
        Person person3 = club.addPerson("Person 3");

        Pet pet1 = person1.addPet("Pet 1");
        Pet pet2 = person1.addPet("Pet 2");
        Pet pet3 = person1.addPet("Pet All");

        Pet pet4 = person2.addPet("Pet 3");
        Pet pet5 = person2.addPet("Pet 4");
        Pet pet6 = person2.addPet("Pet All");

        Pet pet7 = person3.addPet("Pet 5");
        Pet pet8 = person3.addPet("Pet 6");
        Pet pet9 = person3.addPet("Pet All");

        System.out.println("******************************");
        System.out.println("All Club:");
        club.writeInfo();

        person1.removePet("Pet 2");
        person2.removePet("Pet 4");
        person3.removePet("Pet 6");
        System.out.println("******************************");
        System.out.println("Removed Pets \"Pet 2\", \"Pet 4\", \"Pet 6\":");
        club.writeInfo();

        System.out.println("******************************");
        System.out.println("Removed Pets \"Pet All\":");
        club.removePet("Pet All");
        club.writeInfo();
    }

}

