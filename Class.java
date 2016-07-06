///Allen Kalampukattussery
//1-9-15
//This program calculates the average of students in a classroom,and other things

import java.util.Scanner;//scanner

public class Class{//class header
	
	private static int total = 0;//variable total students
	private static int average = 0;//variable average
	private static String input =" ";
	private static int input2 =0;
	private static String input3=" ";
	private static String input4=" ";
	private static int translatedinput = 0;
	private static int translatedinput2 = 0;
	private static int translatedinput3 = 0;
	//variable(s) for input(s) 
	private static int max =0;//maximum
	private static int min = 0;//minimum
	private static int subtractmax=0;
	public static void main(String[] allen){//main()
		input();//call input()
		printer();//call printer()
	}
	public static void input(){//input method
		Scanner in = new Scanner(System.in);//create an instance of scanner
		String[] inputarray = new String[100];
		int[] translatedarray = new int[100];
		System.out.println("How many students are in the class ?");
		input=in.next();
		for(int x =0;x<=99 && input != "Quit";x++){
			inputarray[x]=input;
			System.out.println("How many students are in the class ?");
			input=in.next();//accept input
			translatedarray[x]=Integer.parseInt(input);
		}
		for(int a =0;a<=99;a++){
			input2=translatedarray[a];
			if(input2==0){
				for(int b =99;b>=0;b--){
					total=total+translatedarray[b];
				}
			}
		}
		
		//calculate the average 
		
	}
	public static void printer(){//printer method
		System.out.println(" ");
		System.out.println(" The average class size should be: " +average); //line to print 
	}
		
		
		
}

