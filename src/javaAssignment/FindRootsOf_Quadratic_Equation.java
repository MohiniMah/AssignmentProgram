package javaAssignment;

public class FindRootsOf_Quadratic_Equation {

	public static void main(String[] args) {
		
		int a=5,b=4,c=6;
		int t1=b*b+4*a*c;
		int t2= 2*a;
		double t3=Math.sqrt(t1);
		int x1=(int) ((-b+t3)/t2);
		int x2=(int) ((-b-t3)/t2);
		
		System.out.println(x1);
		System.out.println(x2);

	}

	
}
