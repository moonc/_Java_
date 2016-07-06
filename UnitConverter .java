// Allen Kalampukattussery
//9-24-14
//This program will convert feet to inches,meters,and miles

//Pseudocode is required, as is a testing plan as the last part of the header pseudocode (data types and values)
// on paper , create a diagram showing how the program will be organized into a class and several methods. show one or more examples with arrows indicating what parameters(s) and what returned value would be passed
// You must use at least one parameter, and at least one returned value.
//you may copy inchestofeet.java to start program; copy body of main() and paste into new program,structuring  this code as a second method (after this program's main closes).

import java.util.Scanner; // import scanner

public class UnitConverter //UnitConverter class header
{
// declare feet, meters , miles and inches
		static final double inches = 12.0;
		static final double meters = 0.3048;
		static final double miles =  5280.0;	
	public static void main (String [] args)
	{ //main
		int feet = 0;
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter integer in feet to convert to other units: ");
		feet = scan.nextInt();
		double inch = 0.0;
		double meter = 0.0;
		double mile = 0.0;
		inch = inch(feet);
		meter = meter(feet);// conversions for meters,inches,and miles
		mile = mile(feet);
	
		System.out.println(feet + " feet are " + inch + " inches, " + meter + " meters, " + mile + " miles. ");
}
	public static double meter(double feet) //meters method  header
	{//main double meter(parameter:feet)
		double meter2 = 0.0;
		meter2 = feet/meters; // convert - meters
		return meter2; //main double meter(parameter:feet)
	}
//miles method header 
	public static double mile(double feet)
	{
		double mile2 = 0.0;
		mile2 = feet/miles; //convert - miles
		return mile2;
	}
//inches method header
	public static double inch(double feet)
	{
		double inch2 = 0.0;
		inch2 = feet*inches; //convert -  inches 
		return inch2; // return answer
	}
}