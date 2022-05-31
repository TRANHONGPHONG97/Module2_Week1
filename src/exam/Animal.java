package exercises;

public class Animal {
    String name;
    int age;
    String color;
    String speak(String speak) {
        return speak;
    }
    void showInfor() {
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Màu sắc: " + color);
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        Animal cat = new Animal();

        dog.name = "Mi-lo";
        dog.age = 2;
        dog.color = "đen";

        cat.name = "Miu";
        cat.age = 3;
        cat.color = "trắng";

        System.out.println("1. Thông tin của Chó Mi-lo là: ");
        dog.showInfor();
        System.out.println("Tiếng kêu của chó là: " + dog.speak("Gâu gâu"));

        System.out.println("2. Thông tin của Mèo Miu là: ");
        cat.showInfor();
        System.out.println("Tiếng kêu của mèo là: " + cat.speak("Meo meo"));
    }
}


