package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	public Dog() {
		String name;
		int age;
		String breed;
	}
	public Dog(){
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String x){
		name = x;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String x, String y){
		name = x;
		age = 1;
		breed = y;
	}
	public Dog(String x, int y){
		name = x;
		age = y;
		breed = "dog dog";
	}

	public void setName(String x){
		name = x;
	}
	public void setAge(int x){
		age = x;
	}
	public void setBreed(String x){
		breed = x;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getBreed(){
		return breed;
	}

	public boolean isSleeping(){
		int chance = (int)(Math.random());
		boolean sleep;
		if(chance = 0){
			sleep = true;
			return sleep;
		}
		else{
			sleep = false;
			return sleep;
		}
	}
	public void bark(){
		System.out.println(name + " barks!");
		return;
	}

}
