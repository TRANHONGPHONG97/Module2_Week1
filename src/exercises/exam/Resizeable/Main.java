package exam.Resizeable;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0]=new Circle(3);
        shapes[1]= new Rectangle(4,5);
        shapes[2] = new  Square(3.0);
        System.out.println(Arrays.toString(shapes));
        Random r = new Random();
        double randomValue = 50;
        for (Shape shape: shapes){
            System.out.println("Trước " + shape.getArea());
            if(shape instanceof Resizeable){
                ((Resizeable) shape).resize(randomValue);
            }
            System.out.println("Sau " + shape.getArea());
        }
    }

}
