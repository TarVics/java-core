package resolves.hw4.task3;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {
    private int id;
    private String name;
    private String surname;
    private String email;
    private int age;
    private Gender gender;
    private List<Skill> skills;
    private Car car;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", gender=" + gender +
                ", skills=" + skills.size() +
                '}';
    }

    @Override
    public int compareTo(User o) {
        return this.id - o.getId();
//        return this.skills.size() - o.getSkills().size();
    }
}
