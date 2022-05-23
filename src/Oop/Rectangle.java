package Oop;

import java.util.Scanner;
public class Rectangle {
    double width, height;
    public Rectangle() {
    }
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "{" + "width = " + width + ", height = " + height + "}";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu rong: ");
        double width = sc.nextDouble();
        System.out.println("nhap chieu dai: ");
        double height = sc.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("hinh chu nhat co kich thuoc la: " + rectangle.display());
        System.out.println("chu vi la: " + rectangle.getPerimeter());
        System.out.println("dien tich la: " + rectangle.getArea());
    }
}
