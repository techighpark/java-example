package ch7;

public class InstanceofTest {
    public static void main(String[] args) {
        FireEngine3 fe = new FireEngine3();
//        if (fe instanceof FireEngine3) {
        System.out.println("This is a FireEngine3 instance.");
//        }
//        if (fe instanceof Car3) {
        System.out.println("This is a Car3 instance.");
//        }
//        if (fe instanceof Object) {
        System.out.println("This is a Object instance.");
//        }
    }
}

class Car3 {
}

class FireEngine3 extends Car3 {
}
