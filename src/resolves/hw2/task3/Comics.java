package resolves.hw2.task3;

public class Comics extends Book {
    private String series;

    public Comics() {
    }

    public Comics(double height, int pages, String series) {
        super(height, pages);
        this.series = series;
    }

    public Comics(double density, double width, double height, int pages, String series) {
        super(density, width, height, pages);
        this.series = series;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "series='" + series + '\'' +
                ", density=" + super.getDensity() +
                ", width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                ", pages=" + super.getPages() +
                '}';
    }
}
