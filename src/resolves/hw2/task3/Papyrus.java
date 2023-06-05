package resolves.hw2.task3;

public class Papyrus {
    private double density;
    private double width;

    public Papyrus() {
    }

    public Papyrus(double density, double width) {
        this.density = density;
        this.width = width;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Papyrus{" +
                "density=" + density +
                ", width=" + width +
                '}';
    }
}
