//Allen Kalampukattussery
//11-5-14
//PigOut.java shows the actions when eating foods
import java.util.Scanner;//import Scanner

public class PigOut{//class PigOut header
	private static int nom =0;
	private static String input = " ";
	private static int length = 0;
	private static int numLetter = 0;
	private static String x;
	private static String burp = " ";
	//declare and initialize global variables as private 
		/* nomburp
		 * numLetter
		 * Finput
		 */
	
public static void main(String[] args){//main() header
	LooperAndIf();//call LooperAndIf()
	}
public static void LooperAndIf(){//LooperAndIf method
	System.out.println("What would you like to eat?(Type I'm Full to end the program)");
	Scanner inputGetter = new Scanner(System.in);//make and instance of Scanner
		input = inputGetter.nextLine();//ask user for input
		while(length > 0){
			String x = new String ();
			length = x.length();//take input and use while loop conditions
			while(!(input.equalsIgnoreCase("I'm Full"))){//make a while Loop for length
				System.out.print("nom");
				nom++;
				length--;
				if(nom != 5){
					System.out.print(" burp");
					nom=0;
				}
						//while the length is equal to five , nomburp is 5 noms, one burp
			// form a nomburp string using  length method
			//"I'm full"  is the sentinel value(Terminates the program)
		}
		}

	}		

}