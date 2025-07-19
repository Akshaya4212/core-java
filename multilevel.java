package device;

class Animal{
	void eat() {
		System.out.println("eating");
	}
}

class Dog extends Animal{
	void Bark() {
		System.out.println("Barking");
	}
}

class Cat extends Dog{
	void Meow() {
		System.out.println("Meowing");
	}
}


public class multilevelinheritance {

	public static void main(String[] args) {
		Cat c=new Cat();
		c.Meow();
		c.Bark();
		c.eat();
		// TODO Auto-generated method stub

	}

}
