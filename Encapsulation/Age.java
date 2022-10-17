package Encapsulation;

class Name {

	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Age {
	
	public static void main(String[] args) {
		
		Name n1 = new Name();

		n1.setAge(19);

		System.out.println("Age: "+ n1.getAge());
	}
}
