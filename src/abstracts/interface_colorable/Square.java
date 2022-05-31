package abstracts.interface_colorable;

public class Square extends Shape implements Colorable {
    private double side;

    public Square(){
        side =1.0;
    }
    public Square (double side){
        super();
        this.side = side;
    }
    public Square(String color, boolean filled, double side){
        super(color,filled);
        this.side = side;
    }

    public void setSide(double side) {
        if(side > 0){
            this.side = side;
        }else {
            System.out.println("Cạnh hình vuông nhập vào không hợp lệ!");
        }
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square{color='" + getColor() + "', filled=" + isFilled() +
                ", side=" + side +
                '}';
    }

    @Override
    public String howToColor() {
        return "LAAAAAAAAAAAAA";
    }
}
