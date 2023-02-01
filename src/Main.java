import transport.Bus;
import transport.Car;

public class Main {
    public static void main(String[] args) {
        Car[] auto = new Car[5];
        auto[0] = new Car("Lada",
                "Granta",
                1.7,
                "Желтый",
                2015,
                "Россия",
                150,
                "manual",
                "sedan",
                "а256пр",
                5,
                false,
                null);
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3,"Черный" , 2020, "Германия", 180,
                "auto", "sedan", "т321ро", 5, true, new Car.Key(true, false));
        auto[2] = new Car("BMW", "Z8", 3, "Черный", 2021, "Германия", 180,
                "auto", "sedan", "т321ро", 2, false, new Car.Key(true, true));
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, "Красный", 2018,"Южная Корея",150,
                "auto", "cross", "м525па", 5, true, new Car.Key(true, false));
        auto[4] = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2015, "Южная Корея", 160,
                "auto", "sedan", "и874ап", 5, false, new Car.Key(false, false));
        for (Car j : auto) {
            System.out.println(j);
        }
        Bus[] bus = new Bus[3];
        bus[0] = new Bus( "MarcoPollo", "1", 2019, "Россия", "Белый", 100);
        bus[1] = new Bus( "ПАЗ", "1", 2020, "Россия", "Белый", 100);
        bus[2] = new Bus( "ПАЗ1", "1", 2021, "Россия", "Белый", 100);

        for (Bus i : bus) {
            System.out.println(i);
        }
    }
}