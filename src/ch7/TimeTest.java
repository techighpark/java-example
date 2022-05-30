package ch7;


import java.util.Calendar;

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time(12, 5, 5);
        System.out.println(t);
        //t.hour -> error - variable: private

        Time t2 = new Time();
        System.out.println(t2);
//        System.out.println(t2.toString());
        System.out.println(Calendar.HOUR);
    }
}

class Time {
    private int hour;
    private int minute;
    private int second;

    Time() {
        setHour(Calendar.HOUR);
        setMinute(Calendar.MINUTE);
        setSecond(Calendar.SECOND);
    }

    Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) return;
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) return;

        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) return;

        this.second = second;
    }

    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}


