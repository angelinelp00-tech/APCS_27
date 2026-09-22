/*
 *	Author: Angeline Peng
 *  Date: 9/22/26
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Fortune Cookie Generator!");
		System.out.println("(press ENTER to confirm your answer)");
		System.out.println("Would you like a fortune?");
		System.out.print("Type 0 for no and 1 for yes: ");
		int yesno = sc.nextInt();

		System.out.println("------------------------------------------------------------------");
		if(yesno == 0){
			System.out.println("...");
			System.out.println("Why'd you even open up this code? You should leave before the Java gods come kick you out.");
		}
		else{
			int num = (int)(Math.random() * 15 + 1);
			if(num == 1){
				System.out.println("You are enough just as you are today.");
			}
			if(num == 2){
				System.out.println("You bring a bright light to those around you.");
			}
			if(num == 3){
				System.out.println("Trust your own voice; it is wise and strong.");
			}
			if(num == 4){
				System.out.println("You seek to find meaning from a coded model of a little slip of a paper inside a cookie. You are gullible.");
			}
			if(num == 5){
				System.out.println("All things are difficult before they are easy.");
			}
			if(num == 6){
				System.out.println("Don't pursue happiness - create it.");
			}
			if(num == 7){
				System.out.println("A ship in harbor is safe, but that's not why ships are built.");
			}
			if(num == 8){
				System.out.println("Adventure can be real happiness.");
			}
			if(num == 9){
				System.out.println("Believe in yourself and others will too.");
			}
			if(num == 10){
				System.out.println("Generosity will repay itself sooner than you imagine.");
			}
			if(num == 11){
				System.out.println("The fortune you seek is in another cookie.");
			}
			if(num == 12){
				System.out.println("The secret to getting ahead is getting started.");
			}
			if(num == 13){
				System.out.println("He who controls others is wise, but he who is mighty is superior.");
			}
			if(num == 14){
				System.out.println("It is better to deal with problems before they arise.");
			}
			if(num == 15){
				System.out.println("Knowledge is like a garden: if it is not cultivated, it cannot be harvested.");
			}
			System.out.println("------------------------------------------------------------------");
		}


	}
}
