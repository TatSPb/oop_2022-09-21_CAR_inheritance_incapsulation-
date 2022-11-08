import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* class CAR *********");
        Car ladaGrande = new Car(
                "Lada",
                "Grande",
                1.7,
                "желтый",
                2015,
                "Россия",
                "механическая",
                "седан",
                "123456789",
                5,
                true,
                new Car.Key(false, false),
                new Car.Insurance(LocalDate.of(2020, 9,  13), 10000.00, "123456789")      // public Insurance(LocalDate expireDate, double cost, String insuranceNumber)
        );

        Car audiA8 = new Car(
                "Audi",
                "A8 50 L TDI quattro",
                3.0,
                "черный",
                2020,
                "Германия"
        );
        audiA8.setTransmission("автомат");
        audiA8.setInsurance(new Car.Insurance(LocalDate.of(2022, 5, 11), 30_000, "999999999"));
        audiA8.setKey(new Car.Key(true, true));

        System.out.println(audiA8.toString() + " " + audiA8.getInsurance() + audiA8.getKey());


        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        bmwZ8.setSummerTyres(false);



    }
}