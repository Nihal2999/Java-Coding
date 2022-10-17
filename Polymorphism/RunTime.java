package Polymorphism;

//Method Overriding --> Subclass inheriting method of superclass and changing the method definition 
//                      without changing method declaration is called as method Overriding.

class Parent {
	
	void Print() {

		System.out.println("parent class");
	}
}

class child1 extends Parent {

	void Print() { 
		
		System.out.println("child-1"); 
	}
}

class child2 extends Parent {

	void Print() {

		System.out.println("child-2");
	}
}

class RunTime {

	public static void main(String[] args)
	{	
		Parent a;

		a = new child1();
		a.Print();

		a = new child2();
		a.Print();
	}
}
