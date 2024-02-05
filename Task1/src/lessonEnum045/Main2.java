package lessonEnum045;

public class Main2 {
    public static void main(String[] args) {
        Body audiSedan = new Body("Sedan", "Green", 1892);
        Wheels wheels = new Wheels(4, 18);
        Engine enginAudi = new Engine("34GFhd", 2.6, "275 Kvt", 5);

        Body universal = new Body("universal", "Ellow", 1470);
        Wheels wheelis = new Wheels(4, 20);
        Engine BMWengine = new Engine("DQI97", 3, "355 Kvt", 6);

        Car audiCar = new Car(enginAudi, audiSedan, wheels);
        Car bmwCar = new Car(BMWengine, universal, wheelis);

        System.out.println("Обьем двигателя: " + audiCar.getEngine().getVolume());
        System.out.println(audiCar);

        System.out.println("Обьем двигателя: " + bmwCar.getEngine().getVolume());
        System.out.println(bmwCar);

    }
}
