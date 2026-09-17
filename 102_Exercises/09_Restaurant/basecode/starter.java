/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("=======================================");
		System.out.println("Welcome to the restaurant creator!");
		System.out.println("=======================================");
		System.out.println();
		System.out.println("We need help making a restaurant name and 3 new dishes.");

		System.out.println("(press ENTER to confirm your answer)");
		System.out.print("The restaurant name will be: ");
		String name = sc.nextLine();
		System.out.println();

		System.out.print("The owner of " + name + " is: ");
		String owner = sc.nextLine();
		System.out.println();
		
		System.out.println("---------------------------------------------");
		System.out.println();
		System.out.println("Now it's time to make the dishes.");
		System.out.print("Item 1: ");
		String i1 = sc.nextLine();
		System.out.print("Price of " + i1 + ": ");
		double price1 = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		System.out.print("Item 2: ");
		String i2 = sc.nextLine();
		System.out.print("Price of " + i2 + ": ");
		double price2 = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		System.out.print("Item 3: ");
		String i3 = sc.nextLine();
		System.out.print("Price of " + i3 + ": ");
		double price3 = sc.nextDouble();
		sc.nextLine();
		System.out.println();

		System.out.println("--------------------------------------------------");
		System.out.println();
		System.out.println("Now it's time to order your food.");
		
		System.out.print("How many " + i1 + " would you like (whole numbers only): ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		double total1 = price1 * num1;

		System.out.print("How many " + i2 + " would you like (whole numbers only): ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		double total2 = price2 * num2;

		System.out.print("How many " + i3 + " would you like (whole numbers only): ");
		int num3 = sc.nextInt();
		sc.nextLine();
		System.out.println();
		double total3 = price3 * num3;

		double subtotal = total1 + total2 + total3;
		double tax = subtotal * 0.0975;

		System.out.print("What percent would you like to tip (whole number): ");
		int tip = sc.nextInt();
		double tip1 = (subtotal * tip) / 100.0;
		System.out.println();

		double comptotal = subtotal + tip1 + tax;

		System.out.println("=====================================================");
		System.out.println(name + " - Menu for Today");
		System.out.println("=====================================================");
		System.out.println("Owner: " + owner);
		System.out.println("-----------------------------------------------------");
		System.out.println("Item                  Qty       Price");
		System.out.println("-----------------------------------------------------");
		System.out.println(i1 + "                   " + num1 + "    " + total1);
		System.out.println(i2 + "                   " + num2 + "    " + total2);
		System.out.println(i3 + "                   " + num3 + "    " + total3);
		System.out.println("-----------------------------------------------------");
		System.out.println("Subtotal:               " + subtotal);
		System.out.println("Tax (9.75%):            " + tax);
		System.out.println("Tip:                    " + tip + "%");
		System.out.println("Tip Amount:             " + tip1);
		System.out.println("-----------------------------------------------------");
		System.out.println("TOTAL:                  $" + comptotal);
		System.out.println("-----------------------------------------------------");

	}
}
