package Inheritance;

class One {
	public void Object() {
		System.out.println("Eat");
	}
}

class Two extends One {
	public void Super() {
		System.out.println("Sleep"); 
	}
}

class Three extends Two {
	public void Sub()
	{
		System.out.println("Repeat");
	}
}

public class Multilevel {
	
	public static void main(String[] args) {
		
		Three t1 = new Three();
		t1.Object();
		t1.Super();
		t1.Sub();
	}
}