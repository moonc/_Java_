//Allen
//11-14-14
import java.util.Scanner;
public class Game{
	private static String start = " ";
	private static String exit =" ";
	public static String q1 =" ";
	private static double level = 0;
	private static int hold = 3;
	public static void main(String[] args){
		IfLOOPER();
	}
	public static void IfLOOPER(){
		Scanner in = new Scanner(System.in);
		System.out.println("	Welcome to the Game	(v1.0)	");
		System.out.println("	  [Start]  [Exit]	");
		start = in.next();
		if(start.equals("Start")|| start.equals("start")||start.equals("START")||start.equals("StArT")||start.equals("sTaRt")){
			System.out.println("Which level would you like to complete ?");
			level = in.nextDouble();
				if(level == 1){
					System.out.println("You see a girl laying on the ground bleeding . What do you do? : ");
					System.out.println("[a] Walk away");
					System.out.println("[b] Call for help");
					System.out.println("[c] Try to help by yourself");
					q1 = in.next();
					if(q1.equals("b")||q1.equals("B")){
						System.out.println("Correct");
					
					
					}
					while(!q1.equalsIgnoreCase("b") || !q1.equalsIgnoreCase("B")){
						System.out.println("You see a girl laying on the ground bleeding . What do you do? : ");
						System.out.println("[a] Walk away");
						System.out.println("[b] Call for help");
						System.out.println("[c] Try to help by yourself");
						q1 = in.next();
						if(q1.equals("b")||q1.equals("B")){
						System.out.println("Correct");
					
					
					}
				
				}
				if(level != 1)
					System.out.println("This level is locked.Please complete the other levels to unlock.");
		}
	else{
		System.out.println("Are you sure(y = yes , n = no)");
		exit = in.next();
			if(exit.equals("y")){
				System.out.println("See you later alligator!");
				}
				else
					System.out.println("Beta 1.5 will fix this");
	}
	}
}
}
