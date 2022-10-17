package Inheritance;

class A {
	public void one() {
		System.out.println("Class A"); 
	}
}

class B extends A {
	public void two() {
		System.out.println("Class B"); 
	}
}

class C extends A {
	public void three() {
		System.out.println("Class C"); 
	}
}

class D extends A {
	public void four() { 
		System.out.println("Class D"); 
	}
}

public class Hierarchical {
	
	public static void main(String[] args) {
		
		B b = new B();
		b.one();
		b.two();

		C c = new C();
		c.one();
		c.three();

		D d = new D();
		d.one();
		d.four();
	}
}
