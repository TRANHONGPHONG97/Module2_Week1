package exercises.animal_machine;

public class Nemo extends Animal implements Swimable {
    @Override
    public void swim() {
        System.out.println(getName()+ " bơi ngửa");
    }
    public Nemo(String name){
        super(name);
    }

}
