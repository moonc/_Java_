/*Allen Kalampukattussery
9-18-14
This program is for the conversion of inches to feet.*/

import java.util.Scanner;

public class IFC{ 
	public static void main (String[]  args){
		int inches;
		double feet;
		Scanner inputGetter = new Scanner(System.in);
		System.out.println("Welcome to the Inches To Feet converter! Enter the integer to be converted into Feet");
		inches = inputGetter.nextInt();
		feet = inches/12.0;
		System.out.printf( "%d inches equals %.2391654f feet\n ",inches,feet);
	}
}