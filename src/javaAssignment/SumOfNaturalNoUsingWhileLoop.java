package javaAssignment;

public class SumOfNaturalNoUsingWhileLoop {

	public static void main(String[] args) {
		int i=1;
		int num=20;
		int sum=0;
		while(i<=num) {
			sum= sum+i;
			i++;
		}
		System.out.println("sumof 1 to 10 natural no is : "+sum);
	}

}
