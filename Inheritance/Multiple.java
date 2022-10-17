package Inheritance;

interface X {
	public void Super();
}

interface Y {
	public void Super();
}

interface Z extends X, Y {
	public void Sub();
}

class M implements Z {
	
	@Override 
	public void Super() {
		System.out.println("Father");
	}

	public void Sub() { 
		System.out.println("Son"); 
	}
}

public class Multiple {
	
	public static void main(String[] args) {
		
		M m = new M();
		m.Super();
		m.Sub();
	}
}

