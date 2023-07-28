package javaAssignment;

public class FindingTheLargestNo {

	public static void main(String[] args) {
		int a=1;
		int b=25;
		int c=3;
		if((a>b)&&(b>c)&&(c<a)){
			System.out.println("the largest no is : " +a);
		}
		else if((b>a)&&(b>c))
		{
			System.out.println("the largest no is : " +b);
		}
		else
			System.out.println("the largest no is : " +c);
	}

}
