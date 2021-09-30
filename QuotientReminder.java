	package corebasics;
	import java.util.Scanner;

	public class QuotientReminder {
		public static void main(String[] args) {
			int dividend, divisor;
			int quotient, remainder;
			System.out.println("Welcome to Quotient and Reminder Program");
			//Printing the dividend and divisor values
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the Dividend value = ");
			dividend = sc.nextInt();
			System.out.println("Enter the Divisor value = ");
			divisor = sc.nextInt();
			//Condition to print Quotient and Remainder
			quotient = (dividend / divisor);
			remainder = (dividend % divisor);
			System.out.println("The Quotient is : " + quotient);
			System.out.println("The Remainder is : " + remainder);
		}
	}
