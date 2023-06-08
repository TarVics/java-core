package resolves.hw3.task2;

public class Main {
    /*
        Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
        Интерфейс Инструмент содержит метод play()
        Гитара содержит переменные класса количествоСтрун,
        Барабан - размер, Труба - диаметр. Создать массив типа Инструмент, содержащий инструменты разного типа.
        В цикле вызвать метод play() для каждого инструмента,
        который должен выводить строку "Играет такой-то инструмент c такими то характеристиками".
    */
    public static void main(String[] args) {

        Instrument[] instruments = {
                new Guitar(7),
                new Drum(35),
                new Trumpet(5),
                new Guitar(17),
                new Drum(135),
                new Trumpet(50)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
