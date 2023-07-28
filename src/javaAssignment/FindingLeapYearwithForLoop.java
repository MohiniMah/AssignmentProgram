package javaAssignment;

public class FindingLeapYearwithForLoop {

	public static void main(String[] args) {
	//int year;
	 for (int leapYear = 2001; leapYear <= 2100; leapYear += 4) {
         if((leapYear - 1) % 40 == 0) {
             System.out.println(" ");
         }
         System.out.print(leapYear + " ");
     }
	 for (int leapYear = 2000; leapYear <= 2100; leapYear += 4) {
         if((leapYear - 1) % 4 == 0) {
             System.out.println("leap years are : ");
         }
         System.out.print(leapYear + " ");
     }
	}

}
