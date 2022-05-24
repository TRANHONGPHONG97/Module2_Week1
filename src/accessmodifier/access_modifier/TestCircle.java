package accessmodifier.access_modifier;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2.0);
        System.out.println(circle.getRadius());
        System.out.println(circle.getArea());
    }
}
