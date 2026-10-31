/*
 *	Author:  Angeline Peng
 *  Date: 10/30/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf a = new PooleDwarf("Sneezy", 1);
		PooleDwarf b = new PooleDwarf("Doc", 3);
		PooleDwarf c = new PooleDwarf("Grumpy", 4);
		PooleDwarf d = new PooleDwarf("Happy", 6);
		PooleDwarf e = new PooleDwarf("Bashful", 3);
		PooleDwarf f = new PooleDwarf("Dopey", 4);
		PooleDwarf g = new PooleDwarf("Sneezy", 6);

		int countDup = 0;
		if(a.isSameName(b.getName())){
			countDup++;
		}
		else if(a.isSameName(c.getName())){
			countDup++;
		}
		else if(a.isSameName(d.getName())){
			countDup++;
		}
		else if(a.isSameName(e.getName())){
			countDup++;
		}
		else if(a.isSameName(f.getName())){
			countDup++;
		}
		else if(a.isSameName(g.getName())){
			countDup++;
		}
		System.out.println(a.getName() + " was the name with " + countDup + " matches!");
		
	}
}
