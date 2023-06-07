package resolves.hw3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Magazine implements Printable {
    private String publisher;
    private String title;

    @Override
    public void print() {
        System.out.println("Publisher: " + publisher + "\nTitle: " + title);
    }
}
