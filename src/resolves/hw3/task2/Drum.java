package resolves.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        String name = this.getClass().getName();
        System.out.println("Playing " + name.substring(name.lastIndexOf('.') + 1) +
                "(size: " + size + ")");
    }
}
