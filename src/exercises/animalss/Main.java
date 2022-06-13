package animalss;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        //truy cập các thuộc tính của dog được thừa kế từ Animals
        dog.setName("Milo");
        dog.setAge(3);
        dog.setColor("white");
        //truy cập các phương thức của dog được thừa kế từ Animals
        dog.showInfo();
    }
}
