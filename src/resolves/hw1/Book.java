package resolves.hw1;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString()
@Setter
@Getter
public class Book {
    String title;
    int pages;
    String genre;
    String[] authors;

}

