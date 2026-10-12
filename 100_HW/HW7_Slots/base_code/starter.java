/*
 *	Author: Angeline Peng
 *  Date: 10/7/26
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Slot Machine!");
		System.out.println("Slot Machine Rules:");
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("	a. If two numbers match, you double your money.");
		System.out.println("	b. If three numbers match, you triple your money.");
		System.out.println("	c. If none match, you lose your money.");

		int money = 100;
		while(money > 0){
			System.out.println("------------------------------------------------------------------------");
			System.out.print("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n): ");
			String yes = sc.nextLine();
			while(!yes.equals("no") && !yes.equals("N") && !yes.equals("n") && !yes.equals("Yes") && !yes.equals("yes") && !yes.equals("Y") && !yes.equals("y")){
				System.out.println("That is an invalid answer. Please try again.");
				System.out.println("------------------------------------------------------------------------");
				System.out.print("Would you like to play the slots? (Yes/yes/Y/y) or (No/no/N/n): ");
				yes = sc.nextLine();
			}
			if(yes.equals("Yes") || yes.equals("yes") || yes.equals("Y") || yes.equals("y")){
				System.out.print("You have $" + money + ". How much would you like to wager? ");
				int wager = sc.nextInt();
				sc.nextLine();
				while(wager > money){
					System.out.print("You only have $" + money + "! Please enter a smaller number: ");
					wager = sc.nextInt();
					sc.nextLine();
				}
				money = money - wager;
				int num1 = (int)(Math.random() * 10 + 1);
				int num2 = (int)(Math.random() * 10 + 1);
				int num3 = (int)(Math.random() * 10 + 1);
				System.out.println("");
				System.out.println("Great! Let's play!!!");
				System.out.println("Your rolls are: ");
				System.out.println("========================");
				System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " |");
				System.out.println("========================");
				if(num1 == num2 && num2 == num3){
					wager = wager * 3;
					money = money + wager;
					System.out.println("You won! You're wager has been tripled!");
					System.out.println("You now have $" + money + ".");
				}
				else if(num1 == num2 || num1 == num3 || num2 == num3){
					wager = wager * 2;
					money = money + wager;
					System.out.println("You won! You're wager has been doubled!");
					System.out.println("You now have $" + money + ".");
				}
				else{
					System.out.println("You didn't win this time, better luck next time!");
					System.out.println("You now have $" + money + ".");

					if(money == 0){
						System.out.println("You've run out of money. Thanks for coming! Come back soon!");
						break;
					}
				}

			}
			else if(yes.equals("No") || yes.equals("no") || yes.equals("N") || yes.equals("n")){
				System.out.println("Thanks for coming! Come back soon!");
				System.out.println("You ended with $" + money + ".");
				break;
			}
		}
	}
}
