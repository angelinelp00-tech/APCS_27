/*
 *	Author:
 *  Date:
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Guessing Game!");
		System.out.println("The goal of the game is to guess the word with only 2 hints.");
		System.out.println("Here's the first clue:");
		System.out.println("It's a fruit.");
		System.out.print("Your guess: ");
		String fruit = sc.nextLine();


	}
}
