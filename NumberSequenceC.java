
//Allen 

import java.util.Scanner;//import Scanner

public class NumberSequenceC{//class header
private static int tries = 2;
private static int input = 0;
private static int pint = 0;
private static int seq = 30;
private static double dseq = 0;
private static int triesAT = 1;
private static double seq2 = 5;
private static double input2 = 0;
private static double seq3 = 100;
private static double input3 = 0;
//declare and initialize global variables
	public static void main(String [] args){//main() method
		decideQuestion();
		
	}
	public static void decideQuestion(){//decideQuestion() method 
		Scanner in = new Scanner(System.in);
		System.out.println("Which sequence would you like to solve?");
		dseq = in.nextDouble();
		while(seq <= 30  && seq > 0 && dseq == 1){ //generate number sequence
			System.out.print(seq + ",");
			seq = seq - 3;
		}
		while(seq2 <=30 && seq2 >-12 && dseq == 2){
			System.out.print(seq2 + ",");
			seq2 = seq2-2;
		}
		while(seq3 <=100 && seq3 > 0 && dseq == 3){
			System.out.print(seq3 + ",");
			seq3-=23;
		}
		if(dseq == 1){
		System.out.println("___");//print
		System.out.println("What number is next ? ( Hint it's a number between zero and two.)");
		input = in.nextInt();
		while(input !=0 && tries !=0){
			System.out.println("What number is next ? ( Hint it's a number between zero and two.)");
			input = in.nextInt();
			tries= tries-1;
			}
		while(tries == 0 && input !=0 && triesAT!=0){
			System.out.println("You have run out of attempts. Please try again later.");
			triesAT = triesAT -1;
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
		if(dseq == 2){
		System.out.println("___");//print
		System.out.println("What number is next ? ( Hint : negative number)");
		input2 = in.nextDouble();
		while(input2 !=-13 && tries !=0){
			System.out.println("What number is next ? ( Hint : negative number.)");
			input2 = in.nextDouble();
			tries= tries-1;
			
		}
		while(tries == 0 && input2 != -13 && triesAT !=0){
			System.out.println("You have run out of attempts. Please try again later.");
			triesAT = triesAT -1;
		}
		if(input2 == -13){
			System.out.println("Correct");
			System.out.println("What is the number you add to get this pattern?");
			pint = in.nextInt();
		}
		if(pint == -2){
			System.out.println("Good Job ! Try Number 1 and 3 if you haven't already!");
		}
		else
			System.out.println("Incorrect.");		
		}
		if(dseq == 3){
		System.out.println("___");//print
		System.out.println("What number is next ? ( Hint : negative number)");
		input3 = in.nextDouble();
		while(input3 !=-15 && tries!=0){
			System.out.println("What number is next ? ( Hint : negative number.)");
			input3 = in.nextDouble();
			tries= tries-1;
		}
		while( tries == 0 && input3!=-15 && triesAT!=0){
			System.out.println("You have run out of attempts. Please try again later.");
			triesAT = triesAT -1;
		}
		if(input3 == -15){
		System.out.println("Correct");
		System.out.println("What is the number you add to get this pattern?");
		pint = in.nextInt();
		}
		if(pint == -23){
			System.out.println("Good Job ! Try Number 1 and 2 if you haven't already!");
		}	
		else
			System.out.println("Incorrect.Try another Puzzle!");
		}
	else
		System.out.println("That Puzzle does not exist!");
	}
}
