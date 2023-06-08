package resolves.hw2.task2;

public class Main {

    // Створити та описати наступну їєрархію
    // PC-Laptop-Ultrabook
    // PC-Laptop-Workstation
    // Загальна кількість вкористаних класів - 4!

    public static void main(String[] args) {
        PC ws = new Workstation();
        PC ub = new Ultrabook();

        System.out.println(ws);
        ws.hello();
        System.out.println(ub);
        ub.hello();
    }
}


