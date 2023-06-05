package resolves.hw2.task4;

public enum Gender {
    MALE("male"),
    FEMALE("female");

    private final String label;
    public String getLabel() {
        return this.label;
    }

    Gender(String label) {
        this.label = label;
    }
}
