///Allen Kalampukattussery
//11-26-14
//SyllableCounter.java counts the number of syllables in a given string
//rules:
//Starting y omitted:
//(a) when words begin with y, we dont count the starting y as a vowel. (we are
//assuming there are no words that start with y followed immediately by a consonant)
//Silent e omitted:
//(a) when e is the last letter of a word, well assume it is silent, unless the word is cafe or
//entree (words borrowed from French). (*well ignore all other words to simplify)
//For simplification, it may be best to create a new String without this silent e, before
//checking for more syllables.
//With the silent-e omitted, one-syllable units:
//(a) have a single vowel.
//(b) have two vowels that are the same letter in succession.
//(c) have two vowels in immediate succession that are ei, ie, ea, ou, ey, ay, oy, uy, ai.
//(d) have three vowels in immediate succession that are eau, iou ( yes, there are
//exceptions to this that we are ignoring here).
//With the silent-e omitted, two-syllable units:
//(a) two vowels in immediate succession where the vowels are different letters not
//following the rule above. For instance, oe, io, oi.
//(b) three vowels in immediate succession not following the rule above where the last
//vowel is not a silent e. For instance (eye) as in meyer.

import java.util.Scanner;//import Scanner

public class SyllableCounter{//class header

private static String input;//global variables
private static int hold = 0;
private static int hold2 = 0;
private static int y = 0;
private static int x =1;
	public static void main(String[] friedchicken){//main()
	
	ifelse();//call  ifelse()
	}
	public static void ifelse(){//AK() which decides the rules and does the actual process.
	
	Scanner in = new Scanner(System.in);//create a new instance of Scanner :in.
	
	System.out.println("Please enter a word or sentence : ");//prompt for input
	input=in.next();//get an input(string)
	
	if(input.length() > 0){//ifelse block with vowels
	
		if(input.charAt(0) == 'y')// if charAT(0) to decide the exceptions for y vowel
			System.out.println(input +" has one syllable.");

		while(x>1){//loop to check for spaces
			input.indexOf(' ',y);//indexOf(0,starting int) to check for spaces .ASCII ---> 32
				y=y+1;//while loop to seperate strings
			}
		//make a loop  for the last two rules
			//indexOf() to deicde if the combinations exist (ei, ie, ea, ou, ey, ay, oy, uy, ai).
				//if the combinations exist,  
				
			}
	}
		
		
		
		
		

}
