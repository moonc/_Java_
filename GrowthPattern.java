//Allen Kalampukattussery
//1-7-15
//This displays a historgram of a plants growth

public class GrowthPattern{//class header
	private static int total = 136;
	private static int time = 15;
	private static int rate = 0;
	private static int value1 = 0;
	private static int value2 = 0;
	private static int value3 = 0;
	private static int value4 = 0;
	private static int value5 = 0;
	private static int value6 = 0;
	private static int value7 = 0;
	private static int value8 = 0;
	private static int value9 = 0;
	private static int value10 = 0;
	private static int value11 = 0;
	private static int value12 = 0;
	private static int value13 = 0;
	private static int value14 = 0;
	private static int value15 = 0;
	private static int y = 0;
	private static String symbol = " ";
	private static String concatedstring = " ";//global variables to use to calculate the growth rate
	//variable time is the number of times measured
	public static void main(String[] allen){//main() method
	
		printer();//call print method
	}
	public static void printer(){//printing method
		int [] growthdata ={5,2,6,7,8,9,8,9,9,11,13,11,11,12,15};
		value1=growthdata[y];
		value2=growthdata[y+1];
		value3=growthdata[y+2];
		value4=growthdata[y+3];
		value5=growthdata[y+4];
		value6=growthdata[y+5];
		value7=growthdata[y+6];
		value8=growthdata[y+7];
		value9=growthdata[y+8];
		value10=growthdata[y+9];
		value11=growthdata[y+10];
		value12=growthdata[y+11];
		value13=growthdata[y+12];
		value14=growthdata[y+13];
		value15=growthdata[y+14];
		System.out.printf("%s\t%s","t0","00000");//display  first time with '0'
			//display increase with '+' 
			//display decrease with '-'
			//add the first two 
		if(value1>value2){
			symbol="-";
			for(int a =0;a<value2;a++){
				concatedstring+=symbol;
				
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t1",concatedstring);
			concatedstring = " ";
			symbol = " ";
		}
		if(value2<value3){
			symbol="+";
			for(int b=0;b<value3;b++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t2",concatedstring);
			concatedstring = " ";
			symbol=" ";
			
		}
		if(value3<value4){
			symbol="+";
			for(int c =0;c<value4;c++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t3",concatedstring);
			concatedstring = " ";
			symbol = " ";
			
		}
		if(value4<value5){
			symbol="+";
			for(int d = 0;d<value5;d++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t4",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value5<value6){
			symbol="+";
			for(int e = 0;e<value6;e++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t5",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value6>value7){
			symbol="-";
			for(int f = 0;f<value7;f++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t6",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value7<value8){
			symbol="+";
			for(int g = 0;g<value8;g++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t7",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value9==value8){
			symbol="0";
			for(int a =0;a<value9;a++){
			concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t8",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value8==value9){
			symbol="0";
			for(int a =0;a<value9;a++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t9",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value9<value10){
			symbol="+";
			for(int a =0;a<value10;a++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t10",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value10<value11){
			symbol="+";
			for(int a =0;a<value11;a++){
			concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t11",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value11>value12){
			symbol="-";
			for(int a =0;a<value12;a++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t12",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value12==value13){
			symbol="0";
			for(int a =0;a<value13;a++){
				concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t13",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value13<value14){
			symbol="+";
			for(int a =0;a<value14;a++){
			concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t14",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		if(value14<value15){
			symbol="+";
			for(int a =0;a<value15;a++){
			concatedstring+=symbol;
			}
			System.out.println(" ");
			System.out.printf("%s\t%s","t15",concatedstring);
			concatedstring=" ";
			symbol=" ";
		}
		rate = total/time;//calculate growth  
		System.out.println(" ");
		System.out.println("The growth rate is " + rate);
		}
}
