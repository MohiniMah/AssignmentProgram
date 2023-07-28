package javaAssignment;

public class Power_Of_The_No {
	
	public static void main(String [] args) {
		//5 to the power 4 is means 5is multiply itself 4 times
		//5*5*5*5=625 in that
		
		int base =6;  
		int exponent=4;
		int r=exponent;
		int power=1;
		 while(exponent!=0) {
			 power=power*base;
			 exponent--;
		 }
		 System.out.println(base +" to the power " + r + " is: "+power);  
}
	

}
