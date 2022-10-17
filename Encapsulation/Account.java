package Encapsulation;

class Details { 

	private long acc_no; 
	private String name;
	private String email; 
	private float amount;
	
	public Details() {
		super();
	}

	public long getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	} 
	 
} 

class Account { 
		
	public static void main(String[] args) { 
		
		Details d1 = new Details(); 
		 
		d1.setAcc_no(987654321); 
		d1.setName("Nihal"); 
		d1.setEmail("nihal123@gmail.com"); 
		d1.setAmount(1000); 
		
		System.out.println("Account_No : " +d1.getAcc_no());
		System.out.println("Name       : " +d1.getName());
		System.out.println("Email      : "+d1.getEmail());
		System.out.println("Amount     : "+d1.getAmount()); 
	} 
}
