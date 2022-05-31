package exercises.animal_machine;

public class Bolt extends Animal implements Barkable, Runable {
    public Bolt(String name) {
        super(name);
    }

    @Override
    public void bark() {
        System.out.println(getName() + " sủa gâu gâu");
    }

    @Override
    public void run() {
        System.out.println(getName() + " chạy nhanh như con báo");

    }
}
