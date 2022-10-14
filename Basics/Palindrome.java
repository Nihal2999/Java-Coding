package Basics;

public class Palindrome {
	
	public static void main(String[] args) {
		
		int sum = 0, r, temp;
		
		int n = 2002;
		
		temp = n;
		
		while(n > 0)
			
		{    
			  r = n % 10;
			  
			  sum = (sum * 10) + r;
			  
			  n = n / 10;
		} 
		
		if(sum == temp)
		{
			System.out.println("Its a palindrome");
		}
		
		else
		{
			System.out.println("Not a palindrome");
		}
	}

}