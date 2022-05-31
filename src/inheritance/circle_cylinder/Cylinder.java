package inheritance.circle_cylinder;

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){

    }
    public Cylinder(double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return super.getArea() * height;
    }
    @Override
    public String toString(){
        return String.format(
                "Cylinder {height = %s,volume = %s}",
                height, Math.round(getVolume()));
    }
}
