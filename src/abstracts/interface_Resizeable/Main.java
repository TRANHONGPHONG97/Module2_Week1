package abstracts.interface_Resizeable;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
       Shape [] shapes = new Shape[3];
       shapes[0] = new Circle(2);
       shapes[1] = new Rectangle(3,4);
       shapes[2] = new Square(2.0);

        System.out.println(Arrays.toString(shapes));
        Random r = new Random();
        double randomValue = 50; // 1 + (100-1) * r.nextDouble();
        for (Shape shape : shapes){
            System.out.println("Area Before: " + shape.getArea());
            if (shape instanceof  Resizeable) {
                ((Resizeable) shape).resize(randomValue);
            }
            System.out.println("Area After: " + shape.getArea());
        }
    }
}
