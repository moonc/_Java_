/* Grades */

import java.util.Scanner;

public class Grades{
	public static void main (String[] args){
		int cows;
		double patties;
		Scanner inputGetter = new Scanner(System.in);
		System.out.printf("Welcome to the super high tech cow patty calculator! Please enter the number of cows to be turned into quarter pound patties: ");
		cows = inputGetter.nextInt();
		patties = cows*2024.0;
		System.out.printf( "%.2f patties can be made out of %d cows! How tasty!",patties,cows);
	}
}

