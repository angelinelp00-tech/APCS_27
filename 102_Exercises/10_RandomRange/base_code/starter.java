/*
 *	Author: Angeline Peng
 *  Date: 9/17/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 2 numbers to create a range for your random number.");
		System.out.println("(press ENTER to confirm your answer)");

		System.out.print("Enter an integer (whole number): ");
		int x = sc.nextInt();
		System.out.print("Enter another integer (bigger than the first): ");
		int y = sc.nextInt();

		System.out.println("Your range is " + x + " to " + y);
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.println((int)(Math.random() * (y - x) + x) + ", " + (int)(Math.random() * (y - x) + x) + ", " + (int)(Math.random() * (y - x) + x) + ", " + (int)(Math.random() * (y - x) + x) + ", and " + (int)(Math.random() * (y - x) + x) + ".");
	}
}
