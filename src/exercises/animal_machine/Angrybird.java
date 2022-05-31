package exercises.animal_machine;

public class Angrybird extends Animal implements Flyable {
    @Override
    public void fly() {
        System.out.println(getName()+ " bay lên cao");
    }
    public Angrybird(String name){
        super(name);
    }
}
