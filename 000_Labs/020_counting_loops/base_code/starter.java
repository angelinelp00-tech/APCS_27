/*
 *	Author:  Angeline Peng
 *  Date: 10/6/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);

		System.out.print("Your name: ");
		String name = sc.nextLine();
		System.out.print("# of times your name is going to be printed (whole number): ");
		int times = sc.nextInt();
		sc.nextLine();

		int count = 1;
		while(count <= times){
			System.out.print(name + " ");
			count++;
		}
		System.out.println("");


		
	}
}
