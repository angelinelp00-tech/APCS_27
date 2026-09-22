/*
 *	Author:  Angeline Peng
 *  Date: 9/21/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("(press ENTER to confirm your answer)");
		System.out.println("The goal of this game is to guess the correct number from 1-1000.");
		System.out.print("Please type your whole number guess here: ");
		int num = sc.nextInt();

		int right = (int)(Math.random() * (1000 - 1) + 1);
		if(num == right){
			System.out.println("The number was " + right + " and your number was " + num + ", so your guess was CORRECT!!! HOW IN THE WORLD DID YOU GUESS THAT RIGHT?? GO BUY YOURSELF A LOTTERY TICKET RIGHT NOW!!");
		}
		else{
			System.out.println("The number was " + right + " and your number was " + num + ", so your guess was INCORRECT.");
			System.out.println("It's OK though, it was pretty unlikely for you to guess the correct number in the first place.");
		}
	}
}
