package resolves.hw2.task2;

public class Ultrabook extends Laptop {
    private double size = 14.5;

    public Ultrabook(double size) {
        this.size = size;
    }

    public Ultrabook() {
    }

    @Override
    public double getScreenSize() {
        return this.size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public void info() {
        System.out.println("Ultrabook");
    }

    @Override
    public String toString() {
        return "Ultrabook{" +
                "size=" + size +
                '}';
    }
}
