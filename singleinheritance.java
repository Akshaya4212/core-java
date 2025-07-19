package device;

class Animal {
    String name;
    String type;
    String colour;

    public Animal(String name, String type, String colour) {
        this.name = name;
        this.type = type;
        this.colour = colour;
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}

class Dog extends Animal {
    Dog(String name, String type, String colour) {
        super(name, type, colour);
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog("Tommy", "Husky", "Brown");
        d.bark();
        d.eat();
    }
}
