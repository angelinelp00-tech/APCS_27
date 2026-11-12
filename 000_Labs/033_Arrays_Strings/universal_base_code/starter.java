/*
 *	Author:  Angeline Peng
 *  Date: 11/10/26
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		String[] song = new String[10];
		song[0] = "Baby, we built this house on memories";
		song[1] = "Take my picture now, shake it 'til you see it";
		song[2] = "And when your fantasies become your legacy";
		song[3] = "Promise me a place in your house of memories";
		song[4] = "Whoa, whoa, whoa";
		song[5] = "Whoa, whoa";
		song[6] = "I think of you from time to time";
		song[7] = "More than I thought I would";
		song[8] = "You were just too kind and I was too young to know";
		song[9] = "That's all that really matters";
		int count = 0;
		while(count < 10){
			System.out.println(song[count]);
			count++;
		}
		
	}
}
