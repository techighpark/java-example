package ch;

import java.util.Calendar;
import java.util.Date;

class ClassEx {
    int[] hour = new int[3];
    int[] minute = new int[3];
    float[] second = new float[3];
}
//시 분 초 섞여서 올바르지 않은 데이터가 될 가능성

class Time {
    private int hour;
    private int minute;
    private float second;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public float getSecond() {
        return second;
    }

    public void setHour(int h) {
        if (h < 0 || h > 23) return;
        hour = h;
    }

    public void setMinute(int m) {
        if (m < 0 || m > 59) return;
        minute = m;
    }

    public void setSecond(float s) {
        if (s < 0 || s > 59) return;
        second = s;
    }
}

class Time1 {
    public static void main(String[] args) {
        Time time1 = new Time();
        time1.setHour(2);
        System.out.println(time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());

        Calendar rightNow = Calendar.getInstance();
        int rightNowHour = rightNow.get(Calendar.HOUR_OF_DAY);
        int rightNowMinute = rightNow.get(Calendar.MINUTE);
        System.out.println(rightNow);
        System.out.println(rightNowHour);
        System.out.println(rightNowMinute);

        Date today = new Date();
        System.out.println(today);
    }


}

