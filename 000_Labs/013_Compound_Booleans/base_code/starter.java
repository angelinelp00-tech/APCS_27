/*
 *	Author:  Angeline Peng
 *  Date: 9/21/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("(press ENTER to confirm your answer)");
		System.out.print("Please enter a whole number: ");
		int x = sc.nextInt();
		System.out.print("Enter a whole number: ");
		int y = sc.nextInt();
		System.out.print("Enter your last whole number: ");
		int z = sc.nextInt();

		if((x < z) && (y < z)){
			System.out.println(z + " is the largest number out of the three.");
		}
		if((x < y) && (z < y)){
			System.out.println(y + " is the largest number out of the three.");
		}
		if((z < x) && (y < x)){
			System.out.println(x + " is the largest number out of the three.");
		}


		if((x < y) && (x < z)){
			System.out.println(x + " is the smallest number out of the three.");
		}
		if((y < x) && (y < z)){
			System.out.println(y + " is the smallest number out of the three.");
		}
		if((z < y) && (z < x)){
			System.out.println(z + " is the smallest number out of the three.");
		}

	}
}
