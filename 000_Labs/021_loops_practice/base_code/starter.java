/*
 *	Author:  Angeline Peng
 *  Date: 10/6/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
	Scanner sc = new Scanner(System.in);

	System.out.println("Welcome to the Guessing Game!");
	System.out.println("The goal of the game is guess the correct number from 1-1000.");
	System.out.println("-----------------------------------------------------------------------");
	System.out.println("(press ENTER to confirm your answer)");

	int num = (int)(Math.random() * 1000 + 1);
	String right = "";
	int count = 0;
	while(true){
		System.out.print("Your guess (whole number): ");
		int guess = sc.nextInt();
		sc.nextLine();

		if(guess == num){
			System.out.println("");
			System.out.println("Wow you guessed the correct number!");
			System.out.println("It only took you " + count + " guesses!");
			break;
		}
		else if(guess < num){
			System.out.println("");
			System.out.print("Your guess is less than the correct number.");
			System.out.println(" Try again.");
		}
		else if(guess > num){
			System.out.println("");
			System.out.print("Your guess is greater than the correct number.");
			System.out.println(" Try again.");
		}
		count++;
	}
	



		
	}
}
