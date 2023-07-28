package javaAssignment;

public class Check_Armstrong_Number {

	public static void main(String[] args)
	{
	
		int reminder ,cube , sum = 0;
		int number=371;
		int OrigNum = number;
		
		while(OrigNum!=0) {
			
			reminder = OrigNum%10;
			cube = reminder*reminder*reminder;
			sum = cube+sum;
			OrigNum = OrigNum/10;
		}
		
		if(sum==number) {
			System.out.println("the given no " +number+ " is Armstrong no  ");
		}
		else
			System.out.println("the given no " +number+ " is not Armstrong no  ");
	}
	}
