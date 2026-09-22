/*
 *	Author: Angeline Peng 
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
		System.out.print("Please enter another whole number: ");
		int y = sc.nextInt();
		
		if(x == y){
			System.out.println(x + " and " + y + " are equal.");
		}
		if(x != y){
			System.out.println(x + " and " + y + " are NOT equal.");
		}

	}
}
