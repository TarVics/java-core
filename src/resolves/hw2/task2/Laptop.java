package resolves.hw2.task2;

public abstract class Laptop extends PC {

    @Override
    public void hello() {
       System.out.println("Hello Laptop");
    }

    public abstract double getScreenSize();
}
