package Inheritance;

class Parent {
	public void Super() {
		System.out.println("Hello");
	}
}

class Child extends Parent {
	public void Sub() { 
		System.out.println("World"); 
	}
}

public class Single {
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.Super();
		c.Sub();
	}
}
