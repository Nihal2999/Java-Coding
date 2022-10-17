package Polymorphism;

class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Cat extends Animal {
	  public void animalSound() {
	    System.out.println("The cat says: meow meow");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}

	class Poly {
	  public static void main(String[] args) {
	    Animal A1 = new Animal();  
	    Animal Cat1 = new Cat(); 
	    Animal Dog1 = new Dog(); 
	    A1.animalSound();
	    Cat1.animalSound();
	    Dog1.animalSound();
	  }
	}