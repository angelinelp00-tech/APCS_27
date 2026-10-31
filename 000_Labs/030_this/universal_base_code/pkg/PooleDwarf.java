/*
 *	Author:  Angeline Peng
 *  Date: 10/30/26
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class PooleDwarf {
	private String name;
	private int age;

	public PooleDwarf() {		// Default Constructor
		name = new String("");
		age = 0;
	}

	public PooleDwarf(String name, int age){
		// Complete this constructor
		this.name = name;
		this.age = age;
	}

	/*	Accessor Methods */
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}

	/*	Mutator Methods	*/
	public void setName(String nane){
		// Fix this method
		this.name = name;
		return;
	}
	
	public void setAge(int age){
		// Fix this method
		this.age = age;
		return;
	}

	public boolean isSameName(String name){
		// Complete this method
		boolean same = this.name.equals(name);
		return same;
		
	}
}

