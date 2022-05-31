package abstracts.interface_colorable;

public class Main {
    public static void main(String[] args) {
        Shape shapes [] = new Shape [3];
        shapes[0] = new Circle(2.5);
        shapes[1] = new Rectangle(4,5);
        shapes[2] = new Square(6.5);

        for (Shape shape : shapes){
            System.out.println(shape.toString());
            System.out.println("Diện tích: " + shape.getArea());
            if(shape instanceof Colorable){
                System.out.println(((Colorable) shape).howToColor());
            }
        }
    }
}
