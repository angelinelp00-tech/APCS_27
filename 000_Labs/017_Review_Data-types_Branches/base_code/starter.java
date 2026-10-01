/*
 *	Author:  Angeline Peng
 *  Date: 9/28/26
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);

		System.out.println("(press ENTER to confirm your response for the following questions)");
		
		System.out.print("Character name: ");
		String name = sc.nextLine();
		
		System.out.print(name + "'s title (ex: the Great): ");
		String title = sc.nextLine();
		
		System.out.print(name + " " + title + "'s role (warrior, wizard, or rogue): ");
		String role = sc.nextLine();
		if(role.equals("Wizard") || role.equals("wizard")){
			role = "wizard";
		}
		else if(role.equals("Warrior") || role.equals("warrior")){
			role = "warrior";
		}
		else if(role.equals("Rogue") || role.equals("rogue")){
			role = "rogue";
		}
		else{
			role = "[error]";
		}

		System.out.println("---------------------------------------------------------------");
		int points = 20;
		System.out.println("You have a total of 20 points to spend on the following stats.");
		System.out.println("The maximum for each individual stat is 10 points.");
		System.out.println("Please answer a whole number.");
		System.out.print("Strength - Buff and able to carry larger items: ");
		int strength = sc.nextInt();
		sc.nextLine();
		points = points - strength;
		System.out.println("");
		if(points < 0){
			points = points + strength;
			strength = 0;
			System.out.println("You have ran out of points.");
		}
		else{
			System.out.println("Points left: " + points);
		}
		System.out.print("Dexterity - Agile and moves quick: ");
		int dex = sc.nextInt();
		sc.nextLine();
		points = points - dex;
		System.out.println("");
		if(points < 0){
			points = points + dex;
			dex = 0;
			System.out.println("You have ran out of points.");
		}
		else{
			System.out.println("Points left: " + points);
		}
		System.out.print("Intelligence - Better at magic spells: ");
		int intel = sc.nextInt();
		sc.nextLine();
		points = points - intel;
		System.out.println("");
		if(points < 0){
			points = points + intel;
			intel = 0;
			System.out.println("You have ran out of points.");
		}
		else{
			System.out.println("Points left: " + points);
		}
		System.out.print("Charisma - How personable: ");
		int charisma = sc.nextInt();
		sc.nextLine();
		points = points - charisma;
		if(points < 0){
			points = points + charisma;
			charisma = 0;
			System.out.println("You have ran out of points.");
		}
		else{
			System.out.println("Points left: " + points);
		}

		System.out.println("---------------------------------------------------------------");
		System.out.println(name + " " + title + " is a " + role + " and has these stats:");
		System.out.println("Strength: " + strength + "/10");
		System.out.println("Dexterity: " + dex + "/10");
		System.out.println("Intelligence: " + intel + "/10");
		System.out.println("Charisma: " + charisma + "/10");

	}
}
