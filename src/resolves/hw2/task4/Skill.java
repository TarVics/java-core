package resolves.hw2.task4;

public class Skill {
    private String title;
    private int exp;

    public Skill() {
    }

    public Skill(String title, int exp) {
        this.title = title;
        this.exp = exp;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }

    @Override
    public String toString() {
        return "Skill{" +
                "title='" + title + '\'' +
                ", exp=" + exp +
                '}';
    }
}
