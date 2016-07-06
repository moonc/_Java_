/* Allen Kalampukattussery
10-30-14
This program will tell if the sum of a number adds up to ten */

import java.util.Scanner;
public class Sum{
		static int input;
		static int input2;
		static int output;
		static int output2;
	public static void main (String []args){
		System.out.println("Please enter an integer between 1 and 10 :");
		Scanner input = new Scanner(System.in);
		input = inputGetter.nextInt();
		if(input >= 0  && input <=10){
			System.out.println("Please enter a second number : ");
	}
	 Scanner input2 = new Scanner(System.in);
	 int input2 = inputGetter.nextInt();
	if(input2 >= 0 && input2 <= 10){
		output2 = input+input2;
	}
	if(output2 == 10){
		System.out.println("Your two numbers add up to ten " );
	}
	else if(output2 > 10 || output2 < 10){
		System.out.println("Sorry, your number does not add up to ten exactly");
	}
}
}
