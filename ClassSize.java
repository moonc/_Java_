///Allen Kalampukattussery
//1-9-15
//This program calculates the average of students in a classroom,and other things

import java.util.Scanner;//scanner

public class ClassSize{//class header
        
        private static int total = 0;//variable total students
        private static int average = 0;//variable average
        private static String input =" ";
        private static int input2 =0;
        private static String input3=" ";
        private static String input4=" ";
        //variable(s) for input(s)
        private static int subtractmax=0;
        private static int subtractmin=0;
        private static int b =0;
        private static int d = 1;
        private static int maximum =0;//maximum
        private static int min = 0;//minimum
        private static int num=0;
        private static int adder=0;
        public static void main(String[] allen){//main()
                input();//call input()
                printer();//call printer()
        }
        public static void input(){//input method
                Scanner in = new Scanner(System.in);//create an instance of scanner
                //String[] inputarray = new String[100];
                int[] translatedarray = new int[100];
                System.out.println("How many students are in the class ?");
                input=in.next();
                translatedarray[0]=Integer.parseInt(input);
                for(int x =0;x<=99 && input.equalsIgnoreCase("Quit") != true;x++){
                        //inputarray[x]=input;
                        System.out.println("How many students are in the class ?");
                        input=in.next();//accept input
                        if(input.equalsIgnoreCase("Quit")!=true){
							translatedarray[x+1]=Integer.parseInt(input);
						}
                }
                for(int a =0;a<=99;a++){
                        input2=translatedarray[a];
                        if(input2==0){
                                adder=translatedarray[b];
                                for(int x = 1;x<=99;x++){
									adder+=translatedarray[x];
								}
								total=adder;
                        }
                }
                for(int c =0;c<=99&&d!=0;c++){
					d=translatedarray[c];
					if(d==0){
						num=c-1;
						
					}
				
				}
				for(int c =99;c<=99 && c>=0;c--){
					if(translatedarray[c]=0){
						maximum=Math.max(translatedarray[c-1],translatedarray[c-2]);
					}
				
				}
					System.out.println(maximum);
				for(int a =0;a<=99;a++){
					if(translatedarray[a]>36){
						subtractmax=translatedarray[a]-36;
						System.out.printf("%s\t\t%s","Room "+(a+1)+ " has a greater number of people than the maximum.","+"+subtractmax+" people");
					
					
						}
					}
				average=total/num; //calculate the average 
        }
        public static void printer(){//printer method
                System.out.println(" ");
                System.out.println(" The average class size should be: " +average); //line to print 
        }
                
                
                
}
