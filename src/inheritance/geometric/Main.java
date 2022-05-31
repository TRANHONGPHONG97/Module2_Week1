package inheritance.geometric;

public class Main {
    public static void main(String[] args) {
//        Test Shape
        Shape shape = new Shape("red", false);
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);

//        Test Circle
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle("indigo",true , 3.5);
        System.out.println(circle);

//        Test Rectangle
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        rectangle = new Rectangle(2.3, 5.8);
        System.out.println(rectangle);

        rectangle = new Rectangle("orange", true, 2.5, 3.8);
        System.out.println(rectangle);

//        Test Square
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square("yellow", true, 5.8);
        System.out.println(square);
    }
}

