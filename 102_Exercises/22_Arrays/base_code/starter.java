/*
 *	Author: Angeline Peng
 *  Date: 11/9/26
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int [] mult3 = new int[1001];
		int [] sub = new int[1001];

		int countMult = 0;
		while(countMult < mult3.length){
			mult3[countMult] = (countMult + 1) * 3;
			countMult++; 
		}
		countMult = 0;
		while(countMult <= 1000){
			System.out.println(mult3[countMult]);
			countMult++;
		}
		System.out.println("\n\n");

		countMult = 0;
		while(countMult < sub.length){
			sub[countMult] = 1000 - countMult;
			countMult++; 
		}
		countMult = 0;
		while(countMult < 1001){
			System.out.println(sub[countMult]);
			countMult++;
		}
	}
}
