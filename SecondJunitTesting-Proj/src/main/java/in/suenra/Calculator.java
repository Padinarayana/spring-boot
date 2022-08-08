package in.suenra;

public class Calculator {

	public int add(int a,int b) {
		
		if(a<0 && b<0 ) {
			throw new IllegalArgumentException("Invalid Inputs");
		}
		return a+b;
	}
	
	public int mul(int a,int b) {
		return a*b;
	}
	
	
	public boolean palindrome(String str) {
		
		String reverse="";
		int n=str.length();
		
		for (int i=n-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		if(str.equals(reverse))
			return true;
		else
			return false;
	}
	
	
	public String evenOrOdd(int num) {
		if(num%2==0)
			return "even";
		else
			return "odd";
	}
}
