public class Main {
    public static void main(String[] args) {
        System.out.println("\n********* class CAR *********");
        Car ladaGrande = new Car(
                "Lada",
                "Grande",
                1.7,
                "желтый",
                2015,
                "Россия", //String productionCountry
                "механическая",   //String transmission
                "седан",    //String bodyType,
                "123456789",   //String regNumber,
                5, // int numberOfSeats,
                true, //        boolean summerTyres,

                //КАК ЧЕРЕЗ КОНСТРУКТОР ВНЕСТИ ДАННЫЕ ПО ВЛОЖЕННЫМ КЛАССАМ Insurance & Key ???
                (false, false),     //public Key() {this(false, false);
                (2022 - 09 - 13, 10000.00, 123456789)   // public Insurance(LocalDate expireDate, double cost, String insuranceNumber)
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

        //КАК ВНЕСТИ ДАТУ????
        //audiA8.setInsurance(new Car.Insurance(2016-05-20, 30000, "123456789" );


        audiA8.getInsurance().

        checkExpireDate();
        audiA8.getInsurance().

        checkInsuranceNumber();
        audiA8.setKey(new Car.Key(true, true));

        Car bmwZ8 = new Car(
                "BMW",
                "Z8",
                3.0,
                "черный",
                2021,
                "Германия"
        );
        bmwZ8.setSummerTyres(false);


        /***** CAR СТРАХОВКА И ДОСТУП ****/
        //КАК ВНЕСТИ ДАТУ????
        Car.Insurance ladaGrandeIns = new Car.Insurance(2022 - 09 - 13, 3263.23, "#2398");
        System.out.println(ladaGrandeIns);


    }
}