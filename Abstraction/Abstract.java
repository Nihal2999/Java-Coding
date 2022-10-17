package Abstraction;

abstract class Animal {

	public abstract void animalSound();
	
	public void sleep() {
		
		System.out.println("zzzzzzz");
	}
}

class Pig extends Animal {
	
	public void animalSound() {

		System.out.println("wee wee");
	}
}

class Abstract {
	
	public static void main(String[] args) {
		
		Pig p1 = new Pig();
		p1.animalSound();
		p1.sleep();
	}
}