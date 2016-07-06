///@author Allen Kalampukattussery
///1-15-15
///Displays a scatterplot of data on the question

public class Scatterplot{//class header

	//

	public static void main(String[] allen){//main()
		display();//call display method to printer graph
	}
	
	public static void display(){//display method
		String[][] data={{"4:30","4:40","4:50","5:00"},{"56.99","54.88","55.70","56.47"}};//double 2d array to store data
		System.out.printf("\t\t%s%s","|",data[1][0]);
		System.out.println(" ");
		System.out.printf("\t\t%s\t\t\t%s","|",data[1][3]);
		System.out.println(" ");
		System.out.printf("\t\t%s\t\t%s","|",data[1][2]);
		System.out.println(" ");
		System.out.printf("\t\t%s\t%s","|",data[1][1]);
		//print the scatter plot graph
		System.out.println(" ");
		System.out.println("		____________________________________________________________");
		for(int g =0;g<29;g++){
			System.out.print(" ");
		}
		System.out.println("Time every 10 minutes");
	}


}
