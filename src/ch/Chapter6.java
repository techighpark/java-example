package ch;

public class Chapter6 {
}

class Exercise6_6 {
    @SuppressWarnings("SameParameterValue")
    static double getDimension(int x, int y, int x1, int y1) {
        int dx = (x - x1) * (x - x1);
        int dy = (y - y1) * (y - y1);
        return Math.sqrt(dx + dy);

    }

    public static void main(String[] args) {
        System.out.println(getDimension(1, 1, 2, 3));
    }
}

