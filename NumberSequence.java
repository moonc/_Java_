//Allen Kalampukattussery
//11-12-14
//This will print out a quiz with number sequences.

import java.util.Scanner;//import Scanner

public class NumberSequence{//class header
private static int tries = 2;
private static int input = 0;
private static int pint = 0;
private static int seq = 30;
//declare and initialize global variables
	public static void main(String [] args){//main() method
		decideQuestion();
		
	}
	public static void decideQuestion(){//decideQuestion() method 
		Scanner in = new Scanner(System.in);
		while(seq <= 30  && seq > 0){ //generate number sequence
			System.out.print(seq + ",");
			seq = seq - 3;
	}
		System.out.println("___");//print
		System.out.println("What number is next ? ( Hint it's a number between zero and two.)");
		input = in.nextInt();
		while(input !=0 && tries !=0){
			System.out.println("What number is next ? ( Hint it's a number between zero and two.)");
			input = in.nextInt();
			tries= tries-1;
		}
		if(tries == 0){
			System.out.println("You have run out of attempts. Please try again later.");
			
		}
		if(input == 0){
			System.out.println("Correct");
			System.out.println("What is the number you add to get this pattern?");
			pint = in.nextInt();	
		}
		if(pint == -3){
			System.out.println("Good Job!");
		}
	}

}
