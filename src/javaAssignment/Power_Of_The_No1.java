package javaAssignment;

public class Power_Of_The_No1 {

	public static void main(String[] args) {
		 int num=5;
		 int power=3;
		 int result =1;
		 
		 while(power>0)
			 //for(int i=1 ;i<=power;i++)
		 {
			 result=result*num;
			 power--;
		 }
		 System.out.println(result);
	}

}
