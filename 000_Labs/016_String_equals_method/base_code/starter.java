/*
 *	Author:  Angeline Peng
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("(press ENTER to confirm your answer and check your spelling beforehand)");
		System.out.print("Would you like to be a wizard, warrior or rogue?: ");
		String role = sc.nextLine();

		if(role.equals("Wizard") || role.equals("wizard")){
			System.out.println("Your role is wizard.");
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			System.out.println("Your role is warrior.");
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			System.out.println("Your role is rogue.");
		}
		else{
			System.out.println("Please check your spelling. Your answer was not recognized.");
		}

	}
}
