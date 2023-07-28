package javaAssignment;

public class FindNoIsPrimeOrNot {
	public static void main (String []args) {
		int num=25;
		int c=0;
		
		for(int i=2; i<num;i++) {
			
			if(num%i==0) 
				c=1;
		}
			if(c==0)
				System.out.println("Given no "+num+ " is  prime no ");
			else
				System.out.println("Given no "+num+ " " + "is not Prime no ");
		}
	}



