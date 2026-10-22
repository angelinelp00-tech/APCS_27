/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();

		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();

		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();

		Employee bobby = new Employee(1641, "Bobby", "Bob", 2);
		bobby.employeeToString();

		System.out.println("New salaries:");

		System.out.println("---------------------------");
		System.out.println("Dwight Schrute: ");
		System.out.println("Monthly: " + dwight.getSalary());
		System.out.println("Annual: " + dwight.getAnnualSalary());
		System.out.println("---------------------------");

		System.out.println("---------------------------");
		jim.raiseSalary(5);
		System.out.println("Jim Halpert: ");
		System.out.println("Monthly: " + jim.getSalary());
		System.out.println("Annual: " + jim.getAnnualSalary());
		System.out.println("---------------------------");

		System.out.println("---------------------------");
		pam.raiseSalary(2);
		System.out.println("Pam Beesly: ");
		System.out.println("Monthly: " + pam.getSalary());
		System.out.println("Annual: " + pam.getAnnualSalary());
		System.out.println("---------------------------");

		System.out.println("---------------------------");
		System.out.println("Bobby Bob: ");
		System.out.println("Monthly: " + bobby.getSalary());
		System.out.println("Annual: " + bobby.getAnnualSalary());
		System.out.println("---------------------------");

	}
}
