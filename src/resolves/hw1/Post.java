package resolves.hw1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Getter
public class Post {
    int userId;
    int id;
    String title;
    String body;

    public Post() {
    }
}
