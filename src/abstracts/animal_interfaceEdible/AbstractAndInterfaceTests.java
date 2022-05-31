package abstracts.animal_interfaceEdible;
import abstracts.animal_interfaceEdible.Animal;
import abstracts.animal_interfaceEdible.Edible;
import abstracts.animal_interfaceEdible.Chicken;
import abstracts.animal_interfaceEdible.Tiger;
import abstracts.animal_interfaceEdible.Fruit;
import abstracts.animal_interfaceEdible.Apple;
import abstracts.animal_interfaceEdible.Orange;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
// Tiger and Chicken
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();

        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Chicken) animal;
                System.out.println(edible.howToEat());
//                System.out.println(((Chicken) animal).howToEat());
            }
        }

// Fruit
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();

        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}

