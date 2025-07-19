package device;

interface Character{
	void attack()
;}

interface Weapon{
	void use();
}
class Warrior implements Character,Weapon{
	public void attack() {
		System.out.println("worrior attacks with a sword");
		
	}
	public void use() {
		System.out.println("Worrior uses a sword");
	}
}

class Mage implements Character,Weapon{
	public void attack() {
		System.out.println("Mage attacks with the sward");
		
	}
	public void use() {
		System.out.println("mage uses a sward");
	}
}

public class mutipleinheritance {

	public static void main(String[] args) {
		Warrior warrior = new Warrior();    
        Mage mage = new Mage();    
        warrior.attack(); // Output: Warrior attacks with a sword.    
        warrior.use(); // Output: Warrior uses a sword.    
        mage.attack(); // Output: Mage attacks with a sward.    
        mage.use(); 
		
		// TODO Auto-generated method stub

	}

}
