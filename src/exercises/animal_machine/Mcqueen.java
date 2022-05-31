package exercises.animal_machine;

public class Mcqueen extends Machine implements Runable {
    @Override
    public void run() {
        System.out.println(getName()+ " chạy tốc độ cao");
    }
    public Mcqueen(String name){
        super(name);
    }

}
