package javaAssignment;

public class LCM_OfTwoNo {
	public static void main(String [] args) {
		//30=1,2,3,5,6,10,15,30
		//40=1,2,5,8,10,20,40
		//gcd=1,2,5,10
		//greater gcd=10
		
		//Lcm
		// 30= 2,3,5
		// 40 =2,2,2,5
		//for lcm collect same no and different no
		// lcm= 2,3,5,2,2   multiply all
		// lcm = 2*2*2*3*5
		// lcm = 120
		
		int a=30, b=40;
		int gcd=1; 
		//int L=a*b;
		int lcm;
		
		for(int i=1; i<=a && i<=b; i++)
		{
			
			if (a%i==0 && b%i==0)
				gcd=i;
				//System.out.println(i);
	}
		//System.out.println("GCD of Two no is : " +gcd);
	lcm=(a*b)/gcd;										//formula for finding lcm = a*b/gcd   first we need to find gcd
	System.out.println("Lcm of Two no is : " +lcm);
	}

}
