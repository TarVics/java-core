package resolves.hw2.task3;

public class Main {

    // Cтворити клас ланцюг наслідування:
    // Папірус-Кинга-Журнал
    // Папірус-Книга-Комікс
    // Кількість полів довільна.

    public static void main(String[] args) {
        Magazine mz = new Magazine(10, 15, 20, 125, 6);
        Comics cs = new Comics(15, 20, 25, 60, "Superman");

        System.out.println(mz);
        System.out.println(cs);
    }
}


