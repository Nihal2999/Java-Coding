package Encapsulation;

class Area {

	int length;
	int breadth;

	Area(int length, int breadth) {
		
		this.length = length;
		this.breadth = breadth;
	}


	void getArea() {
	
		int area = length * breadth;
		System.out.println("Area: " + area);
	
	}
}

public class Rectangle {
	
	public static void main(String[] args) {

		Area rectangle = new Area(4, 8);
		rectangle.getArea();
	}
}
