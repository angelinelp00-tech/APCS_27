/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		 System.out.println("An integer between 0 and 9 is " + ((int)(Math.random() * 10)));
		 System.out.println("An integer between 1 and 100 is " + ((int)(Math.random() * 101)));
		 System.out.println("A double between 2.5 and 3.5 is " + (Math.random() * 3.5 + 2.5));
		 System.out.println("A double between 14 and 589 is " + (Math.random() * 589 + 14));
	}
}
