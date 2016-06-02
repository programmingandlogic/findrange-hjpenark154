/*
 * File: FindRange.java
 * --------------------
 * This program is a stub for the FindRange problem, which finds the
 * smallest and largest values in a list of integers.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	public void run() {
		println (" This program finds the largest and smallest numbers.");
		int n = readInt("?");
		int max = n;
		int min = n;
		while (n!=0){
			n = readInt("?");
		if (n > max){
			max = n;
			}
		if (n < min){
			min = n;
			}
		}
		println ("smallest:"+ min +"");
		println ("largest:"+ max +"");
	} 
}