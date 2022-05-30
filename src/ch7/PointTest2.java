package ch7;

public class PointTest2 {
    public static void main(String[] args) {
        Point3D3 p33 = new Point3D3();
        Point3D3 p34 = new Point3D3();
        System.out.println(p33.x);
        System.out.println(p33.y);
        System.out.println(p33.z);

    }
}

class Point3 {
    int x;
    int y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D3 extends Point3 {
    int z;

    Point3D3() {
        this(100, 200, 300);
    }

    Point3D3(int x, int y, int z) {
        super(x, y);
        this.z = z;

    }
}
