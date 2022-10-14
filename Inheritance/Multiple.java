package Inheritance;

class Object
{
	int x1 = 22;
	public static void display()
	{
		System.out.println("this is the display() of a Object class");
	}
}

class Super extends Object
{
	double y1 = 99.99;
	public static void view()
	{
		System.out.println("this is the view() of a Sample class");
	}
}

class Sub extends Super
{
	long z1 = 1234567890;
	public static void test()
	{
		System.out.println("this is the test() of a Sub class");
	}
}


public class Multiple
{
	public static void main(String[] args) 
	{

		Object o1 = new Object();

		o1.display();
		System.out.println("x1 : "+o1.x1);

		Super s1 = new Super();

		s1.view();
		System.out.println("y1 : "+s1.y1);

		s1.display();
		System.out.println("x1 : "+s1.x1);

	}
}