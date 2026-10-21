/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount x = new BankAccount();

		System.out.println("Welcome to the bank.");
		System.out.print("Press 0 to create a bank account or any other number to leave: ");
		int open = sc.nextInt();
		sc.nextLine;
		if (open == 0){
			BankAccount();
			System.out.print("Enter your first and last name: ");
			String owner = sc.nextLine();
		}
		
	}
}
