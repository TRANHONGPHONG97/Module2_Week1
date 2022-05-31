package inheritance.point2D_point3D;

import java.util.Arrays;

public class TestPoint2D {
    public static void main(String[] args) {

        Point2D point2D = new Point2D(6,5);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));
    }
}
