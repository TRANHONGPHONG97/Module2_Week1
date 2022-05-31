package abstracts.interface_Resizeable;

public class Rectangle extends  Shape implements Resizeable{
    private double width;
    private double height;

    public Rectangle (double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * this.height;

    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
    @Override
    public void resize(double percent) {
        width *= (percent / 100);
        height *= (percent / 100);
    }
}
