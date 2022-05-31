package exercises.animal;

abstract class Animal {
    //hàm abstract
    abstract void makeSound();
    public void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    //định nghĩa hàm abstract của lớp cha ở lớp con
    @Override
    public void makeSound() {
        System.out.println("Gâu gâu");
    }
}
//lớp abstract Dog kế thừa lớp abstract Animal

//abstract class Dog extends Animal {
//    public void sleep() {
//        System.out.println("I can sleep.");
//    }

class Main {
    public static void main(String[] args) {
        //tạo một đối tượng của lớp Dog
        Dog d1 = new Dog();
        d1.makeSound();
        d1.eat();
    }
}
//Trong ví dụ trên, lớp abstract Animal gồm phương thức abstract là makeSound() và phương thức bình thường là eat().
//Lớp Dog kế thừa lớp Animal thì lớp Dog bắt buộc phải định nghĩa lại hàm makeSound() của lớp Animal.
