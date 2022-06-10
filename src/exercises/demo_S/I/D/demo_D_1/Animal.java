package exercises.demo_S.I.D.demo_D_1;

public class Animal {
    private final TerrestrialAnimals terrestrialAnimals;
    private final UnderwaterAnimals underwaterAnimals;

    public Animal(TerrestrialAnimals terrestrialAnimals, UnderwaterAnimals underwaterAnimals){
        this.terrestrialAnimals = terrestrialAnimals;
        this.underwaterAnimals = underwaterAnimals;
    }
}
//Như vậy ta thấy rằng 3 lớp Animal, TerrestrialAnimals và UnderwaterAnimals đã không còn phụ thuộc vào nhau.
// Nếu muốn có một TerrestrialAnimals khác thì anh chỉ việc kế thừa Interface Terrestrial.
