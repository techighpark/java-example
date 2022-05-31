package ch8;

public class FinallyTest {
    public static void main(String[] args) {
        method1();
        System.out.println("method1() done.");
    }

    static void method1() {
        try {
            System.out.println("method1() is called.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("catch block");
        } finally {
            System.out.println("finally block");
        }
    }


}
