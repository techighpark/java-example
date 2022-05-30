package ch7;

public class PointTest {
    public static void main(String[] args) {
        Point3D2 p3d2 = new Point3D2(1, 2, 3);
        String value = p3d2.getLocation();
        System.out.println(value);
    }
}


class Point2 {
    int x;
    int y;

    Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getLocation() {
        return x + " , " + y;
    }
}

class Point3D2 extends Point2 {
    int z;

    Point3D2(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    String getLocation() {
        return super.getLocation() + " , " + z;
    }
}