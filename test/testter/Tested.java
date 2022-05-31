package testter;

import abstracts.interface_Resizeable.Circle;
import abstracts.interface_Resizeable.Rectangle;
import abstracts.interface_Resizeable.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tested {
    @Test
    public void testCircle(){
        Circle circle = new Circle(2);
        double before = circle.getRadius();
        circle.resize(50);
        Assertions.assertEquals(before * ((double) 50 /100), circle.getRadius());
    }
    @Test
    public void testSquare(){
        Square square = new Square(2);
        square.resize(50);
        Assertions.assertEquals(1, square.getArea());
    }
    @Test
    public void testRectangle(){
        Rectangle rectangle = new Rectangle(2,6);
        rectangle.resize(50);
        Assertions.assertEquals(1,rectangle.getWidth(), "Không hợp lệ");
        Assertions.assertEquals(3, rectangle.getHeight(), "Không hợp lệ");
        Assertions.assertEquals(3, rectangle.getArea(), "Không hợp lệ");
    }
}
