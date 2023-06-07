package resolves.hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Book implements Printable {
    private String author;
    private String title;

    @Override
    public void print() {
        System.out.println("Author: " + author + "\nTitle: " + title);
    }
}
