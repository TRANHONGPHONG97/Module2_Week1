package Oop;
import java.util.Scanner;
public class QuadraticEquation {
    private double a, b, c, r1, r2, r3;
    private double delta;
    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getA() {
        return a;
    }
    public double getB() {
        return b;
    }
    public double getC() {
        return c;
    }
    public double getR1 (){
        return r1 = (-b + Math.sqrt(delta) / (2 * a));
    }
    public double getR2 (){
        return r2 = (-b - Math.sqrt(delta) / (2 * a));
    }
    public double getR3(){
        return r3 =  (-b / (2 * a));
    }
    public double getDiscriminant() {
        return delta = b * b - 4 * a * c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        System.out.println("Delta la: " + delta);

        if (quadraticEquation.getDiscriminant() > 0) {
            System.out.println("phuong trinh co 2 nghiem phan biet la: "
                    + quadraticEquation.getR1() + " va "
                    + quadraticEquation.getR2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("phuong trinh co nghiem kep la: "
                    + quadraticEquation.getR3());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}
