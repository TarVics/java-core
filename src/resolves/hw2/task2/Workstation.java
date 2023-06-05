package resolves.hw2.task2;

public class Workstation extends Laptop {

    private double size = 27;

    public Workstation(double size) {
        this.size = size;
    }

    public Workstation() {
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getScreenSize() {
        return this.size;
    }

    @Override
    public void info() {
        System.out.println("Workstation");
    }

    @Override
    public String toString() {
        return "Workstation{" +
                "size=" + size +
                '}';
    }
}
