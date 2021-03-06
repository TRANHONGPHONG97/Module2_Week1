package inheritance.shape_triangle;

public class Triangle extends Shape{
    private double slide1 = 1.0;
    private double slide2 = 1.0;
    private double slide3 = 1.0;

    public Triangle() {
    }

    public void Triangle(double slide1, double slide2, double slide3) {
        this.slide1 = slide1;
        this.slide2 = slide2;
        this.slide3 = slide3;
    }

    public double getSlide1() {
        return slide1;
    }

    public void setSlide1(double slide1) {
        this.slide1 = slide1;
    }

    public double getSlide2() {
        return slide2;
    }

    public void setSlide2(double slide2) {
        this.slide2 = slide2;
    }

    public double getSlide3() {
        return slide3;
    }

    public void setSlide3(double slide3) {
        this.slide3 = slide3;
    }

//    public double getArea()

    public double getPerimeter() {
        return slide3 + slide2 + slide1;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "slide1=" + slide1 +
                ", slide2=" + slide2 +
                ", slide3=" + slide3 +
                '}';
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle.getPerimeter());
    }
}
