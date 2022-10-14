package Inheritance;

class Parent
{
	int v1 = 1234;
	public static void display()
	{
		System.out.println("this is the display() of a Parent class");
	}
}

class Child extends Parent
{
	double z1 = 43.21;
	public static void view()
	{
		System.out.println("this is the view() of a Child class");
	}
}

class Single
{
	public static void main(String[] args) 
	{

		Parent p1 = new Parent();

		p1.display();
		System.out.println("v1 : "+p1.v1);

		Child c1 = new Child();

		c1.view();
		System.out.println("z1 : "+c1.z1);

		c1.display();
		System.out.println("v1 : "+c1.v1);

	}
}