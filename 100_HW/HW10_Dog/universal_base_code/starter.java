/*
 *	Author: Angeline Peng
 *  Date: 10/31/26
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("Princess", "chihuahua");
		dog2.setAge(2);

		System.out.print("Dog name: ");
		String name1 = sc.nextLine();
		dog1.setName(name1);
		System.out.print(dog1.getName() + "'s age: ");
		int age1 = sc.nextInt();
		sc.nextLine();
		System.out.println(dog1.getName() + " is a " + dog1.getBreed() + " that is " + dog1.getAge() + " years old!");
		System.out.println(dog2.getName() + " is a " + dog2.getBreed() + " that is " + dog2.getAge() + " years old!");

		if(dog1.isSleeping()){
			System.out.println(dog1.getName() + " is asleep!");
		}
		else{
			System.out.println(dog1.getName() + " is awake!");
			dog1.bark();
			System.out.println(dog2.getName() + " hears " + dog1.getName() + "!");
			dog2.bark();
		}
	}
}
