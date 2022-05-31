package ch8;

import java.io.PrintStream;

public class ExceptionEx13 {
    public static void main(String[] args) {
        PrintStream ps = null; // try 내부에서 선언된 변수는 try 외부에서 사용할 수 없음

        try {
            ps = new PrintStream("Error.log");

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (Exception ae) {
            ae.printStackTrace(ps);
            System.out.println(ae.getMessage());
            assert ps != null;
            ps.println("Exception Message : " + ae.getMessage());
        }
        System.out.println(5);
    }
}
