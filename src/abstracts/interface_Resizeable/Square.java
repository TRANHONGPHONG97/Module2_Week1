package abstracts.interface_Resizeable;

public class Square extends Rectangle implements Resizeable{

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side);
    }

    @Override
    public double getArea() {
        return Math.pow(super.getWidth(), 2);
    }

    @Override
    public double getPerimeter() {
        return 4 * getWidth();
    }

    @Override
    public void resize(double percent) {
        setWidth(getWidth() * (percent / 100));
        setHeight(getWidth());
    }
}
