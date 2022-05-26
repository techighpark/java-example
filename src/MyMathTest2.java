class MyMath2 {
    long a, b;

    // with Instance Variable -> Instance Method
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

//    double divide() {
//        return a / b;
//    }

    // without Instance Variable -> Class Method
    static long add(long a, long b) {
        return a + b;
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }


}

public class MyMathTest2 {
    public static void main(String[] args) {
        // Class Method
//        System.out.println(MyMath2.add(200L, 100L));
//        System.out.println(MyMath2.subtract(200L, 100L));
//        System.out.println(MyMath2.multiply(200L, 100L));
//        System.out.println(MyMath2.divide(200.0, 100.0));

        // Instance Method
        MyMath2 mm2 = new MyMath2();
        System.out.println(mm2.add());
        System.out.println(mm2.subtract());
        System.out.println(mm2.multiply());
//        System.out.println(mm2.divide());
    }
}
