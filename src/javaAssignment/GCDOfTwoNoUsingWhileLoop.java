package javaAssignment;

public class GCDOfTwoNoUsingWhileLoop {

	public static void main(String [] args) {
		int x=30,y=40;
		int lcm;
		int m=x*y;
		while(x!=y) {
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		System.out.println(y);
//		lcm=m/y;
//		System.out.println(lcm);

	}
	
	
}
