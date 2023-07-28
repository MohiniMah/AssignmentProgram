package javaAssignment;

public class PrintReverseInteger {
		//O/P : 54321
	public static void main(String[] args) {
	
		int num=12345;
		int rev=0;			 //reverse
		int rem;			//reminder
		
		while(num>0) {
			
			 rem = num%10; 			// num %10=12345%10=1234     rem=5
			rev   = rev*10+rem;     //0=0*10+5=5 				 rev=5
			 num = num/10; 			//1234/10=123.4
			
		}
			System.out.println(rev);    	//print 5
	}

}

