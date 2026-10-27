/*
	Author: Angeline Peng
	Date: 10/26/26
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman tobey = new Spiderman("Tobey Maguire", 48);
		Spiderman andrew = new Spiderman(40);
		Spiderman tom = new Spiderman("Tom Holland", 27, "The Vulture");
		Spiderman bob = new Spiderman();

		tobey.setVillain("Green Goblin");
		andrew.setActor("Andrew Garfield");
		andrew.setVillain("Electro");
		bob.setAge(2);
		bob.setActor("Bobby Bob");
		bob.setVillain("Homework");

		System.out.println(tobey.getActor() + " is " + tobey.getAge() + " and their greatest nemesis is " + tobey.getVillain());
		System.out.println(andrew.getActor() + " is " + andrew.getAge() + " and their greatest nemesis is " + andrew.getVillain());
		System.out.println(tom.getActor() + " is " + tom.getAge() + " and their greatest nemesis is " + tom.getVillain());
		System.out.println(bob.getActor() + " is " + bob.getAge() + " and their greatest nemesis is " + bob.getVillain());

		tom.fight();
		tom.printArt();
	}
}
