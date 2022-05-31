package ch8;

public class ExceptionEx20 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }

    static void method1() throws Exception {
        System.out.println("method1()");
        throw new Exception();
    }
}
