import  java.util.Scanner;
public class Pre1{
		private static int x = 0;
		private static int y = 0;
		private static int z = 0;
		private static String input = " ";
		private static String output = " ";
		private static String historyinput = " ";
		private static String h = " ";
	public static void main(String[] allen){
		decider();
		printer();
	}
	public static void decider(){
		System.out.println("Hello ! I am Sir Grave .");
		System.out.println("This program has an aim to teach you ! If you wish to continue  don't close it otherwise, close it!");
		System.out.println("You  may see me as this in the program: (^_^) ");
		System.out.println("Enter in a topic :");
		Scanner in = new Scanner(System.in);
		input = in.next();
		if(input.equals("yolo") || input.equals("swag")){
			output="(^_^) : Just No...";
		}
		if(input.equals("No")||input.equals("no"))
			System.out.println("Well thats just rude, I shall see you later!");
		if(input.equals("History") || input.equals("history") || input.equals("HIstory")){
			System.out.println("(^_^) : OK , History it is.");
			System.out.println("(^_^) :  Do you now the city of Rome ?(Answer Yes/No)");
			historyinput = in.next();
			if(historyinput.equals("Yes") || historyinput.equals("yes")){
				System.out.println("Ok.., shall I explain the origin of the city?(Answer Yes/No)");
				h=in.next();
				if(h.equals("Yes")||h.equals("yes")){
					
					
				}
				if(h.equals("No")||h.equals("no")){
					
					
				}
			}
			if(historyinput.equals("No") || historyinput.equals("no")){
				
				
				
			}		
			
		}
	}
	
	public static void printer(){
		System.out.println(output);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
