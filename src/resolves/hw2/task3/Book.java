package resolves.hw2.task3;

public class Book extends Papyrus {
    private double height;
    private int pages;

    public Book() {
    }

    public Book(double height, int pages) {
        this.height = height;
        this.pages = pages;
    }

    public Book(double density, double width, double height, int pages) {
        super(density, width);
        this.height = height;
        this.pages = pages;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "height=" + height +
                ", pages=" + pages +
                '}';
    }
}
