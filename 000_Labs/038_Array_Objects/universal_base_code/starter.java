/*
 *	Author:  Angeline Peng
 *  Date: 11/17/26
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Warrior[] war = new Warrior[100];
		Wizard[] wiz = new Wizard[100];
		int warr = 0;
		int wizz = 0;
		for(int i = 0; i < war.length; i++){
			war[i] = new Warrior();
		}
		for(int e = 0; e < wiz.length; e++){
			wiz[e] = new Wizard();
		}
		while(warr < war.length && wizz < wiz.length){
			wiz[wizz].attack(war[warr]);
			if(war[warr].isDead()){
				warr++;
				if(warr >= war.length){
					break;
				}
			}
			war[warr].attack(wiz[wizz]);
			if(wiz[wizz].isDead()){
				wizz++;
			}
		}
		System.out.println(warr + " " + wizz);

		int left = 0;
		if(warr < wizz){
			left = war.length - warr;
			System.out.println("Warriors won with " + left + " left in their army!");
		}
		else if(wizz < warr){
			left = wiz.length - wizz;
			System.out.println("Wizards won with " + left + " left in their army!");
		}
		else{
			System.out.println("ERROR");
		}
	}
}
