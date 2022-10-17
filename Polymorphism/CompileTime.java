package Polymorphism;

//MethodOverloading --> Developing multiple methods within the same class with the same name which differ in 
//                      No. of arguments or data type of arguments or order of arguments

class Sum {

	static int Multiply(int a, int b)
	{
		return a * b;
	}

	static int Multiply(int a, int b, int c)
	{
		return a * b * c;
	}
}

class CompileTime {

	public static void main(String[] args)
	{
		//calling methods by passing input as arguments
		System.out.println(Sum.Multiply(2, 4));
		System.out.println(Sum.Multiply(2, 7, 3));
	}
}