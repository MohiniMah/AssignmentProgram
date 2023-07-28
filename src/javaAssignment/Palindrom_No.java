package javaAssignment;

public class Palindrom_No {

	public static void main(String[] args) {
		int num=535;
		 int rev=0;
		 int rem;
		 int temp=num;
		 while(num>0) {
			 rem=num%10;
			 rev=rev*10+rem;
			 num=num/10;
		 }
		 if(temp==rev) 
			 System.out.println("the given no is palindrom no");
		 else 
			 System.out.println("the no is not palindrom no");
		 
	}
}

