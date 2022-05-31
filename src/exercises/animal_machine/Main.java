package exercises.animal_machine;

public class Main {
    public static void main(String[] args) {
        Object objects[] = new Object[5];
        objects[0] = new Bolt("Mi lu");
        objects[1] = new Angrybird("Đại bàng");
        objects[2] = new Nemo("Cá vàng");
        objects[3] = new Mcqueen("G63");
        objects[4] = new Siddeley("MH370");
        for (Object obj : objects) {
            if (obj instanceof Barkable)
                ((Barkable) obj).bark();
            if (obj instanceof Runable)
                ((Runable) obj).run();
            if (obj instanceof Flyable)
                ((Flyable) obj).fly();
            if (obj instanceof Swimable)
                ((Swimable) obj).swim();
        }
    }
}
