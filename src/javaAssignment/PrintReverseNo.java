package javaAssignment;

public class PrintReverseNo {

	public static void main(String[] args) {
	 int num=1234;
	 int rev = 0;
	 int reminder;
	 while(num!=0) 
	 {
	  reminder=num % 10;
	  rev=rev*10+reminder;
	  num=num/10;
	 }
	  System.out.println(rev);
	
	}
	
}
