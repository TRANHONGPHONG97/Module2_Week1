package exercises.abstract1;

//abstract parent class

abstract class Person {

    abstract void displayInfo();
}

class Student extends Person {
    @Override
    public void displayInfo() {
        System.out.println("I am a Person");
    }

    public static void main(String[] args) {

        Person person = new Student();
        person.displayInfo();
    }
}


