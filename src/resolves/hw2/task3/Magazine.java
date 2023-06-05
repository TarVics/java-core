package resolves.hw2.task3;

public class Magazine extends Book {
   private int issueNum;

    public Magazine() {
    }

    public Magazine(int issueNum) {
        this.issueNum = issueNum;
    }

    public Magazine(double height, int pages, int issueNum) {
        super(height, pages);
        this.issueNum = issueNum;
    }

    public Magazine(double density, double width, double height, int pages, int issueNum) {
        super(density, width, height, pages);
        this.issueNum = issueNum;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "density=" + super.getDensity() +
                ", width=" + super.getWidth() +
                ", height=" + super.getHeight() +
                ", pages=" + super.getPages() +
                ", issueNum=" + issueNum +
                '}';
    }
}
