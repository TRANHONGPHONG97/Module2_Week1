package inheritance.circle_cylinder;

public class Circle {
    private  double radius = 2.0;
    private   String color = "white";
    Circle(){

    }
    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }
    public double getRadius(){
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    @Override
    public String toString() {
        return String.format(
                "Circle {radius=%s, color=%s}",
                radius, color, getColor());
    }
}
