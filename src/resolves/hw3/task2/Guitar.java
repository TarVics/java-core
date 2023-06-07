package resolves.hw3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guitar implements Instrument {
    private int stringCount;

    @Override
    public void play() {
        String name = this.getClass().getName();
        System.out.println("Playing " + name.substring(name.lastIndexOf('.') + 1) +
                "(string count: " + stringCount + ")");
    }
}
