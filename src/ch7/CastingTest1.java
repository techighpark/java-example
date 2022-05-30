package ch7;

public class CastingTest1 {
    public static void main(String[] args) {
        Car car;
        Car car2 = new Car();
        FireEngine fe = new FireEngine();
        FireEngine fe2;

        fe.water();
        System.out.println(car2);
        car = fe;
        car2 = fe;

        System.out.println(car);
        System.out.println(car2);
        fe2 = (FireEngine) car2;
        System.out.println(fe2);


    }
}

class Car {
    String color;
    int door;

    void drive() {
        System.out.println("drive~");
    }

    void stop() {
        System.out.println("stop");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("water!");
    }
}