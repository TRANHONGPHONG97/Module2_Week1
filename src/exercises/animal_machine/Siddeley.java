package exercises.animal_machine;

public class Siddeley extends Machine implements Flyable {
    @Override
    public void fly() {
        System.out.println(getName()+ " rơi tự do");
    }
    public Siddeley(String name){
        super(name);
    }
}
