package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
	// Default constructor! 				Actor - Unknown, Age - 0, Villain - Unknown
	// String Actor constructor! 			Age - 0, Villain Unknown 
	// int Age constructor! 				Actor - Unknown, Villain Unknown
	// String Actor, int Age constructor! 	Villain Unknown
	// String Actor, int Age, String Villain constructor!		

	public Spiderman(){
		actor = "unkown";
		age = 0;
		villain = "unknown";
	}
	public Spiderman(String x){
		actor = x;
		age = 0;
		villain = "unknown";
	}
	public Spiderman(int x){
		actor = "unknown";
		age = x;
		villain = "unknown";
	}
	public Spiderman(String x, int y){
		actor = x;
		age = y;
		villain = "unknown";
	}
	public Spiderman(String x, int y, String z){
		actor = x;
		age = y;
		villain = z;
	}
	
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	// Ex: getAge and setAge
	public void setAge(int x){
		age = x;
		return;
	}
	public int getAge(){
		return age;
	}
	public void setActor(String x){
		actor = x;
		return;
	}
	public String getActor(){
		return actor;
	}
	public void setVillain(String x){
		villain = x;
		return;
	}
	public String getVillain(){
		return villain;
	}


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
