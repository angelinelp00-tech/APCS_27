/*
 *	Author:  Angleine Peng
 *  Date: 10/22/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the ATM!");
		System.out.print("Name (enter n if you would not like to share.): ");
		String name = sc.nextLine();
		System.out.println("");
		System.out.print("Initial deposit (enter 0 if you would not like to share.): ");
		double inDep = sc.nextDouble();
		sc.nextLine();
		if (name == "n" && inDep == 0.0){
			x = new BankAccount();
		}
		else if(name != "n" && inDep == 0.0){
			x = new BankAccount(name);
		}
		else if (name != "n" && inDep != 0.0){
			x = new BankAccount(name, inDep);
		}
		else{
			System.out.println("Sorry that answer was invalid. \nPlease restart the process.");
		}
		x.checkBalance();
		System.out.println("");
		x.displayAccountInfo();

		
	}
}
