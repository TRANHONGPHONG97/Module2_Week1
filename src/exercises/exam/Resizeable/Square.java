package exam.Resizeable;

public class Square extends Rectangle implements Resizeable {
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side);
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
    public void resize (double percent){
        setWidth(getHeight()*(percent/100));
        setHeight((getWidth()));
    }
}
