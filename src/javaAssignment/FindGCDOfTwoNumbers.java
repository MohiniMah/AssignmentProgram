package javaAssignment;

public class FindGCDOfTwoNumbers {
	//using for loop
	public static void main(String [] args) {
		//30=1,2,3,5,6,10,15,30
		//40=1,2,5,8,10,20,40
		//gcd=1,2,5,10
		//greater gcd=10
		int a=12, b=8;
		int temp=1; 
		
		for(int i=1; i<=a && i<=b; i++)
		{
			
			if (a%i==0 && b%i==0)
				temp=i;
				//System.out.println(i);
	}
		System.out.println("GCD of Two no is : " +temp);
	
}
}
