/*
 *	Author:  Angeline Peng
 *  Date: 9/10/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("Here are the answers:");
		System.out.println(Math.max(13 - 6 * 11, 30 % 7 * (-2)));
		System.out.println(Math.sqrt(3 * 8 + 31 % 7));
		System.out.println(Math.pow(37 / 3, 35 % 21));
		double pow2 = Math.pow(2, 14 % 3);
		double sqrt2 = Math.sqrt(2*6);
		System.out.println(Math.max(pow2, sqrt2));
		System.out.println("");

		System.out.println("Please press the ENTER button to confirm your answer.");
		System.out.print("Enter a whole number: ");
		int x = sc.nextInt();
		System.out.print("Enter another whole number: ");
		int y = sc.nextInt();

		int max = Math.max(x,y);
		double sqrt = Math.sqrt(y);
		double pow = Math.pow(x,y);
		System.out.println("The max of " + x + " and " + y + " is " + max + ", the square root of " + y + " is " + sqrt + ", and the value of " + x + "^" + y + " is " + pow);
	}
}
