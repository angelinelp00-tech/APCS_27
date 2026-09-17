/*
 *	Author: Angeline Peng
 *  Date: 9/16/26
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("(press ENTER to confirm you answer on the following:)");
		System.out.print("Enter a whole number (no letters): ");
		int x = sc.nextInt();
		System.out.print("Enter another whole number (no letters): ");
		int y = sc.nextInt();

		if (x % 2 == 0){
			System.out.println(x + " is an even number.");
		}
		else{
			System.out.println(x + " is an odd number.");
		}

		if (y % 2 == 0){
			System.out.println(y + " is an even number.");
		}
		else{
			System.out.println(y + " is an odd number.");
		}


		if(x % 3 != 0 && x % 4 != 0 && x % 5 != 0){
			System.out.println(x + " is not divisible by 3, 4, or 5.");
		}
		else{
			System.out.println(x + " is divisible by 3, 4, or 5.");
		}

		if(y % 3 != 0 && y % 4 != 0 && y % 5 != 0){
			System.out.println(y + " is not divisible by 3, 4, or 5.");
		}
		else{
			System.out.println(y + " is divisible by 3, 4, or 5.");
		}

		
	}
}
