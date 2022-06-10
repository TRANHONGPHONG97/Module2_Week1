package exercises.demo_S.I.D.demo_I;

public interface Animals {
    void eat();
    void swim();
    void run();
    void fly();
}
// Chúng ta có 1 Interface Animals
// Chúng ta có 2 class Cat và Fish implement interface Animals.
// Nhưng thật vô lý, Cat thì làm sao có thể swim(), cũng như Fish không thể nào fly() được.
// Thay vào đó, chúng ta nên tách thành 4 interface như thế này

