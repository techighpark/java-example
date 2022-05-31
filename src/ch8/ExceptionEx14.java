package ch8;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class ExceptionEx14 {
    public static void main(String[] args) {
        PrintStream ps = null;
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("error.log", true);
            ps = new PrintStream(fos);

            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(0 / 0);
            System.out.println(4);
        } catch (Exception ae) {
            System.out.println("---------------------------------");
            System.out.println("Exception Time : " + new Date());
            ae.printStackTrace(System.err);
            System.out.println("Exception Msg : " + ae.getMessage());
            System.out.println("---------------------------------");
        }
        System.out.println(6);
    }
}
