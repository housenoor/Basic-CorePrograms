	package corebasics;
	import java.util.Scanner;
	public class HarmonicNumber {
		public static void main(String[] args) {
			int num;
			double harmonic;
			System.out.println("Welcome To The Harmonic Series Program");
			//Ask user to enter the number
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number : ");
			num = sc.nextInt();
			sc.close();
			System.out.println("Harmonic series is: ");
			harmonic = 0;
			//while loop for to print harmonic values of given number
			// loop to apply the forumula
			// Hn = H1 + H2 + H3 ... + Hn-1 + Hn-1 + 1/n
			while (num > 0) {
				harmonic = harmonic + (double) 1 / num;
				num--;
				System.out.println(harmonic + " ");
			}
			//System.out.println("");
			System.out.println("The Harmonic  series is =" + harmonic);
		}
	}
