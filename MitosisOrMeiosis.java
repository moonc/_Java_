///@author Allen Kalampukattussery
///1-22-15
//MitosisOrMeiosis Program sorts Cells.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MitosisOrMeiosis{
//If a term has one or two it goes to Meiosis.txt
//If a term is "Interphase" it goes to Interphase.txt
//Else it goes to Mitosis.txt
0
	public static void main(String[] allen){
		MitosisOrMeiosis run = new MitosisOrMeiosis();
		run.List();
	}


	public static void List(){
		String line = " ";
		File interphase = new File("Interphase.txt");
		File meiosis= new File("Meiosis.txt");
		File mitosis= new File("Mitosis.txt");
		File c=new File("Cells.txt");
		Scanner read = null;	//Use Scanner to read line 
		PrintWriter P1 =null;
		PrintWriter P2 = null;
		PrintWriter P3 = null;
		
		//instanitate Scanner with parameter Cells.txt in a try/catch block 
	//to catch FileNotFoundException
		try{
			P3 = new PrintWriter(interphase);//instantiate PrintWriter(P1) using Meiosis.txt in a trycatch block
			P1 = new PrintWriter(meiosis);//instantiate PrintWriter(P2) using Mitosis.txt in a trycatch block
			P2= new PrintWriter(mitosis);//instantiate PrintWriter(P3) using Interphase.txt in a trycatch block
		} catch(FileNotFoundException e){
			System.out.println("Can't find file.");
			System.exit(1);
		}
		try{
			read = new Scanner(c);
		}catch(FileNotFoundException e){
		}

		while(read.hasNextLine()){//loop: repeast reading lines as long hasNextLine();
			line=read.nextLine();
			if(line.endsWith("I")){
				P1.println(line);
				}//write the read line conditionally
		//if .endsWith() I or II, then write line using P2
		//else if .equals "Interphase", then write line using P3
		//else write using line P2
			else if(line.equals("Interphase")){
				P3.println(line);
			}
			else{
				P2.println(line);
			}
		
	}
	
		P1.close();
		P2.close();
		P3.close();
		//close P1,P2,P3
		read.close();
	}



}
