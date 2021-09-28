	package corebasics;
	import java.util.Scanner;

	public class EvenOdd {
		public static void main(String[] args) {
			int number;
			System.out.println("A program to Check whether the number is Even or Odd");
			//Ask user to enter the number
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number to check = ");
			number = sc.nextInt();
			//Condition to check the number
			if ( number % 2 == 0) {
				System.out.println("The number " + number + " is even number ");
			} else {
				System.out.println("The number " + number + " is odd number ");
				sc.close();
			}
		}
	}