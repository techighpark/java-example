public class MyMathTest {
    public static void main(String[] args) {
        MyMath mm = new MyMath();
        long result1L = mm.add(5L, 3L);
        long result1 = mm.add(5, 3);
        System.out.println("result1L : " + result1L);
        System.out.println("result1 : " + result1);

        long result2L = mm.subtract(5L, 3L);
        long result2 = mm.subtract(5, 3);
        System.out.println("result2L : " + result2L);
        System.out.println("result2 : " + result2);

        long result3L = mm.multiply(5L, 3L);
        long result3 = mm.multiply(5, 3);
        System.out.println("result3L : " + result3L);
        System.out.println("result3 : " + result3);

        double result4L = mm.divide(5L, 3L);
        double result4 = mm.divide(5, 3);
        System.out.println("result4L : " + result4L);
        System.out.println("result4 : " + result4);
    }
}


class MyMath {
    long add(long a, long b) {
        return a + b;
    }

    long subtract(long a, long b) {
        return a - b;
    }

    long multiply(long a, long b) {
        return a * b;
    }

    double divide(double a, double b) {
        return a / b;
    }
}

