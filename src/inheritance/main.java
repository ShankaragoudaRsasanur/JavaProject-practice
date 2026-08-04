package inheritance;


class Animal {

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking");
    }
}

public class main {
    public static void Main(String[] args) {

        Dog d1 = new Dog();

        d1.eat();
        d1.bark();

    }
}