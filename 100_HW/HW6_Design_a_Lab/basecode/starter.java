/*
 *	Author: Angeline Peng
 *  Date: 10/4/26
 * 	Collaborator:
 */

import java.util.*;

public class starter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Choose Your Own Adventure!");
		System.out.println("(please press ENTER to confirm your answer");
        System.out.print("Enter your last name here: ");
        String name = sc.nextLine();
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------------------------------");		
		System.out.println("Hello Agent " + name + ".");
		System.out.println("Your mission is to collect a top secret flash drive from our insider.");
		System.out.println("You must get back to base with the flash drive intact to complete the mission.");
		System.out.println("But be careful, news has been circulating that there are moles in your corporation.");
		System.out.println("--------------------------------------------------------------------------------------------------");
		System.out.println("You receive a message on your burner phone with the coordinates for your drop point (35.0116° N, 135.7683° E).");
		System.out.println("");
		System.out.println("Option 1: You parachute onto a dark roof in downtown Kyoto, Japan.");
		System.out.println("Option 2: Disguise yourself as a local and ride the Kyoto Municipal Subway into the city center.");
		System.out.print("Your choice (in numbers): ");
		int one = sc.nextInt();		
		sc.nextLine();
		System.out.println("--------------------------------------------------------------------------------------------------");

		if(one == 2){
			System.out.println("You successfully make it into the city undetected.");
			System.out.println("Once inside the city, you must meet your insider to get the encrypted flash drive.");
			System.out.println("");
			System.out.println("Option 1: Meet at a noisy outdoor coffee shop the next morning.");
			System.out.println("Option 2: You meet in a dark alley tonight.");
			System.out.print("Your choice (in numbers): ");
			int two = sc.nextInt();		
			sc.nextLine();
			System.out.println("-------------------------------------------------------------------------------------------------");
			
			if(two == 1){
				System.out.println("You meet with your insider at the cafe as discussed.");
				System.out.println("As your insider hands over the flash drive, shouting commences near the entrance.");
				System.out.println("You look over and see men flashing badges titled “National Intelligence Bureau”.");
				System.out.println("");
				System.out.println("Option 1: You run through the backdoor towards the Kyoto Municipal Subway.");
				System.out.println("Option 2: Pry open a maintenance hatch and crawl into the ventilation shafts.");
				System.out.print("Your choice (in numbers): ");
				int three = sc.nextInt();		
				sc.nextLine();
				System.out.println("-------------------------------------------------------------------------------------------------");
				
				if(three == 2){
					System.out.println("You make it outside and blend into a crowd of tourists and residents.");
					System.out.println("You see the agents have almost caught up and are racing toward you.");
					System.out.println("");
					System.out.println("Option 1: Hotwire a rare Nissan Skyline GT-R R34 parked on the street corner.");
					System.out.println("Option 2: You leap over the narrow alleys to shake your pursuers on foot.");
					System.out.print("Your choice (in numbers): ");
					int four = sc.nextInt();		
					sc.nextLine();
					System.out.println("-------------------------------------------------------------------------------------------------");

					if(four == 1){
						System.out.println("You reach the extraction helicopter on the outskirts of town.");
						System.out.println("Your coagent tells you to get in quickly.");
						System.out.println("");
						System.out.println("Option 1: You board the helicopter and hand over the drive to your coagent.");
						System.out.println("Option 2: Knock out your partner and pilot the helicopter away by yourself.");
						System.out.print("Your choice (in numbers): ");
						int five = sc.nextInt();		
						sc.nextLine();
						System.out.println("-------------------------------------------------------------------------------------------------");
				
						if(five == 2){
							System.out.println("You toss your coagent out of the helicopter and fly toward the meeting point.");
							System.out.println("When you arrive, you are notified that the coagent you threw overboard was one of the moles.");
							System.out.println("You hand over the drive, proud of yourself.");
							System.out.println("Suddenly, an explosion echoes from across the base.");
							System.out.println("THE END");
				
						}
						else{
							System.out.println("As you hand over the drive, your coagent says “Look at the city. Isn’t it so beautiful?");
							System.out.println("You look over and feel a shove from behind you.");
							System.out.println("You glance over your shoulder as you freefall to see the smug look on your coagent’s face.");
							System.out.println("MISSION OVER");
						}

					}
					else{
						System.out.println("You sprint your way through the city.");
						System.out.println("As you round your last corner, you run into a dead end and you are caught.");
						System.out.println("MISSION OVER");
					}
				}
				else{
					System.out.println("You burst through the backdoor and into the alley behind the cafe.");
					System.out.println("You hear a click near your head and turn around.");
					System.out.println("An man has a weapon pointed at you and flashes his badge, and says “womp womp”.");
					System.out.println("MISSION OVER");
				}
			}
			else{
				System.out.println("You meet with your insider in a dark alley as discussed.");
				System.out.println("As your insider hands over the flash drive, they accidentally drop it in a puddle.");
				System.out.println("The flash drive becomes waterlogged.");
				System.out.println("MISSION OVER");
			}
		}
		else{
			System.out.println("Your parachute attracts too much attention and you are caught.");
			System.out.println("MISSION OVER");
        }
    }
}
