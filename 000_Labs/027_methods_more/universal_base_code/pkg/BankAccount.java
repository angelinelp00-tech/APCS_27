/*
 *	Author:  Angeline Peng
 *  Date: 10/22/26
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	private String owner;
	private int accNum;
	double balance;
	boolean isActive;

	private static int nextAccountNumber = (int)(Math.random() * (1000 - 50) + 50);

	// -------CONSTRUCTORS-------
	public BankAccount(){
		owner = "unknown";
		accNum = nextAccountNumber + 1;
		balance = 0.0;
		isActive = true;
	}

	public BankAccount(String owner){
		owner = owner;
		accNum = nextAccountNumber + 1;
		isActive = true;
		balance = 0.0;
		isActive = true;
	}

	public BankAccount(String owner, double initialDep){
		owner = owner;
		accNum = nextAccountNumber + 1;
		balance = initialDep;
		isActive = true;
	}

	// -------METHODS-------
	public void checkBalance(){
		System.out.println("Balance: $" + balance);
		return;
	}

	public void displayAccountInfo(){
		System.out.println("Owner: " + owner);
		System.out.println("Bank account number: #" + accNum);
		System.out.println("Balance: $" + balance);
		return;
	}

}