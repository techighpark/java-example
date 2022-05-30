package ch;

public class Chaper6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(5, 4);
        System.out.println(p);
    }

}

class MyPoint {
    int x;
    int y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @SuppressWarnings("SameParameterValue")
    double getDistance(int x1, int y1) {
        int dx = (x - x1) * (x - x1);
        int dy = (y - y1) * (y - y1);
        return Math.sqrt(dx + dy);
    }

    public static void main(String[] args) {
        MyPoint p = new MyPoint(1, 1);
        System.out.println(p.getDistance(2, 2));
    }

}