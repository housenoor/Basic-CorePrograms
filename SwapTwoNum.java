	package corebasics;
	import java.util.Scanner;

	public class SwapTwoNum {
		public static void main(String[] args) {
			int num1, num2, swap;
			//Ask user to enter the numbers for swap
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number 1 value =  ");
			num1 = sc.nextInt();
			System.out.println("Enter the number 2 value =  ");
			num2 = sc.nextInt();
			System.out.println("Before swapping the numbers  :: " + num1 + "  " + num2);
			//condition for swapping two numbers
			swap = num1;
			num1 = num2;
			num2 = swap;
			System.out.println("After swapping the numbers  :: " + num1 + "  " + num2);
		}
	}
