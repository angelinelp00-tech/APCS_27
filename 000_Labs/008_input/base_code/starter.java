/*
 *	Author:  Angeline Peng
 *  Date: 9/9/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("Please press enter to confirm your answer on the following questions:");
		System.out.print("Enter your name here: ");
		String name = sc.nextLine();
		System.out.print("Enter your age (one whole number): ");
		int age = sc.nextInt();
		System.out.print("Enter your birth month (one whole number): ");
		int month = sc.nextInt();
		System.out.print("Enter your birth date (one whole number): ");
		int day = sc.nextInt();
		System.out.print("Enter your birth year (one whole number): ");
		int year = sc.nextInt();
		System.out.print("How much is a buck fifty? (Enter as a whole or decimal number): $");
		double buck = sc.nextDouble();
		
		System.out.println("Hello " + name + ", you're " + age + " years old, your birthday is " + month + "/" + day + "/" + year + ", and you believe that a buck fifty is $" + buck);
	}
}
