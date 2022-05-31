package inheritance.point_movablepoint;

import java.util.Arrays;

public class TestMovablePoint {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        System.out.println(movablePoint);
        movablePoint.setXY(2,3);
        movablePoint.setSpeed(4,5);
        System.out.println(movablePoint);
        System.out.println(Arrays.toString(movablePoint.getSpeed()));
        movablePoint.move();
        System.out.println(movablePoint);
    }
}
