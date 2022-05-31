package ch8;

public class ExceptionEx19 {
    public static void main(String[] args) {
        method1();
        System.out.println("donedone");
    }

    static void method1() {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("Exception done.");
            e.printStackTrace();
        }
    }

}
