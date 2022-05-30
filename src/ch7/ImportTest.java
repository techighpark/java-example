package ch7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
        SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
        SimpleDateFormat time2 = new SimpleDateFormat("h:m:s W w m M d dd a");


        System.out.println(today);
        System.out.println("Today is " + date.format(today));
        System.out.println("This is " + time.format(today));
        System.out.println("This is " + time2.format(today));
        System.out.println(time2.format(new Date()));
    }
}
