/*
 *	Author: Angeline Peng
 *  Date: 9/24/26
 * 	Collaborator:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Welcome to the Guessing Game!");
		System.out.println("The goal of the game is to guess the word with only 2 hints.");
		System.out.println("------------------------------------------------");
		System.out.println("Here's the first clue:");
		System.out.println("It's a fruit.");
		System.out.print("Your guess: ");
		String fruit = sc.nextLine();
		System.out.println("------------------------------------------------");

		String right = "";
		String right2 = "";
		String wrongLine = "";
		int answer = (int)(Math.random() * 3 + 1);
		if(answer == 1){
			right = "apple";
			right2 = "Apple";
			wrongLine = "The fruit is most commonly red.";
		}
		else if(answer == 2){
			right = "banana";
			right2 = "Banana";
			wrongLine = "The fruit is most commonly yellow.";
		}
		else if(answer == 3){
			right = "orange";
			right2 = "Orange";
			wrongLine = "The fruit is most commonly orange.";
		}

		if(fruit.equals(right) || fruit.equals(right2)){
			System.out.println("You guessed the correct fruit!");
		}
		else{
			System.out.println("Incorrect answer. I'll give you another clue.");
			System.out.println(wrongLine);
			System.out.print("Your second guess: ");
			String fruit2 = sc.nextLine();
			System.out.println("------------------------------------------------");

			if(fruit2.equals(right) || fruit2.equals(right2)){
				System.out.println("You guessed the correct fruit!");
				System.out.println("Looks like second time's the charm!");
			}
			else{
				System.out.println("Incorrect answer again.");
				System.out.println("Looks like you need to brush up on your fruit knowledge!");
				System.out.println("The correct answer was: " + right);
			}
		}


	}
}
