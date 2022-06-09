package exception_debug.class_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException extends Throwable {
    private double side1;
    private double side2;
    private double side3;

    public IllegalTriangleException(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    public static void main(String[] args) {
        IllegalTriangleException tri = new IllegalTriangleException();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh a, b, c:");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        tri.fillInStackTrace();
    }
    public IllegalTriangleException() {
        if (side1 + side2 <= side3 ||
                side1 + side3 <= side2 ||
                side2 + side3 <= side1 ||
                side1 < 0 || side2 < 0 || side3 < 0)
            try {
                throw new IllegalTriangleException(side1, side2, side3);
            } catch (IllegalTriangleException e) {
                throw new RuntimeException(e);
            }
    }
}
