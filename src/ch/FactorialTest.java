package ch;

public class FactorialTest {
    public static void main(String[] args) {
        System.out.println(factorial(4));
    }

    static long factorial(int n) {
        long result;
        if (n == 1) {
            result = 1;
        } else {
            result = n * factorial(n - 1);
        }
        return result;
    }
}

//class MainTest {
//    public static void main(String[] args) {
//        main(null); // infinite loop error
//    }
//}

class PowerTest {
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        long result = 0;

        for (int i = 1; i <= n; i++) {
            result += power(x, i);
        }
        System.out.println(result);
    }

    static long power(int x, int n) {
        if (n == 1) return x;
        return x * power(x, n - 1);
    }
}