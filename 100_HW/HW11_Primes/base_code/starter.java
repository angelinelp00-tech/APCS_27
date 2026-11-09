/*
 *	Author: Angeline Peng
 *  Date: 11/8/26
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a number and we'll print out every prime until that number: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("");
		printPrimes(num);
		
	}
	public static boolean checkPrime(int a){
		int count = a - 1;
		boolean prime = false;
		if(a == 2){
			prime = true;
		}
		while(count > 1){
			if(a % count != 0){
				prime = true;
			}
			else{
				prime = false;
				return prime;
			}
			count--;
		}
		return prime;
	}
	public static void printPrimes(int a){
		int count = a;
		while(count > 1){
			if(checkPrime(count)){
				System.out.println(count);
				count--;
			}
			else{
				count--;
			}
		}
		return;
	}
}
