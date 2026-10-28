/*
 *	Author:  
 *  Date: 
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
	public void setOwner(String x){
		owner = x;
		return;
	}
	public String getOwner(){
		return owner;
	}
	public double getBalance(){
		return balance;
	}
	public void closeAccount(){
		isActive = false;
		return;
	}
	public void isActive(){
		isActive = false;
		return;
	}
	public void deposit(double x){
		balance = balance + x;
		return;
	}
	public double withdraw(double x){
		int error = 0;
		if(x > balance){
			return error;
		}
		else{
			balance = balance - x;
			return x;
		}
	}

}