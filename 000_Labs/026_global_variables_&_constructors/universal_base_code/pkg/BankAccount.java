/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class BankAccount {
	// -------GLOBAL VARIABLES-------
	String owner;
	int accNum;
	double balance;
	boolean isActive

	private static double nextAccountNumber = Math.random() * (1000 - 50) + 50;

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
	}

	public BankAccount(String owner, double initialDep){
		owner = owner;
		accNum = nextAccountNumber + 1;
		isActive = true;
		balance = initialDep;
	}

	// -------METHODS-------
	
}