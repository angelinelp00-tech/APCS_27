/*
 *	Author:  Angeline Peng
 *  Date: 10/29/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	private String name;
	boolean ugly = true;

	public Ogre() {
		name = "Shrek";
		boolean ugly = true;
	}

	public String getName(){
		return name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(Donkey donkey){
		System.out.println(donkey.getName() + ", what are you doing in my swamp?!");
		return;
	}


}
