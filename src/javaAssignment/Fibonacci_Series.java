package javaAssignment;

public class Fibonacci_Series {

	public static void main(String[] args) {
		int a=0, b=1,c;
		int count=10;
		System.out.println(a);
		System.out.println(b);

		for(int i=0;i<count;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}

	}

}
