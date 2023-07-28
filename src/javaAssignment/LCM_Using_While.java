package javaAssignment;

public class LCM_Using_While {

	public static void main(String[] args) {
		int x=30,y=40;
		int lcm;
		int m=x*y;
		//(x*y)
		
		while(x!=y) {
			if(x>y)
				x=x-y;
			else
				y=y-x;
		}
		lcm=m/y;
		System.out.println(lcm);
	}
}
