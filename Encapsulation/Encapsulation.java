package Encapsulation;

class School {

	private String Name;
	private int Age;
	private int RollNo;

	public School(String Name, int Age, int RollNo) {
		super();
		this.Name = Name;
		this.Age = Age;
		this.RollNo = RollNo;
	}
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getAge() {
		return Age;
	}

	public void setAge(int age) {
		Age = age;
	}
	
	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}
	
}

public class Encapsulation {
	public static void main(String[] args)
	{
		School obj = new School("Nihal", 23, 19);

		System.out.println("Name : " + obj.getName());
		System.out.println("Age : " + obj.getAge());
		System.out.println("RollNo : " + obj.getRollNo());
	}
}
