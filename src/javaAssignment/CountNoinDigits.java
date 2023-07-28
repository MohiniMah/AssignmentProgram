	package javaAssignment;

public class CountNoinDigits {

	public static void main(String[] args) {
		int num=123456;
		int count=0;
		
		for(int i=1;num>0;i++) 
		{
			num=num/10;			
			count++;
		}
		System.out.println(count);
	}

}
