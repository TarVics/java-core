package resolves.hw1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
@Setter
@Getter
public class Comment {
    int postId;
    int id;
    String name;
    String email;
    String body;

    public Comment() {
    }
}
