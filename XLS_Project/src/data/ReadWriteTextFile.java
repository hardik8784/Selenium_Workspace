package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteTextFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Create a new text file
		
		File f = new File("B:\\Hardik-Selenium\\QA\\Testing\\temp.txt");
		f.createNewFile();
		
		//write into Text file
		FileWriter w = new FileWriter(f);
		BufferedWriter out = new BufferedWriter(w);
		
		out.write("This is 1st Line");
		out.newLine();
		out.write("This is 2nd Line");
		out.newLine();
		out.write("This is 3rd Line");
		out.newLine();
		out.write("This is 4th Line");
		out.newLine();
		out.write("This is 5th Line");
		out.newLine();
		out.flush();
		
		
		//Read from Textfile
		FileReader r = new FileReader(f);
		BufferedReader rd = new BufferedReader(r);
		
		/*do
		{
			System.out.println(rd.readLine());
		}
		while(rd.readLine() != null);*/

		String s;
		int i =0;
		while((s= rd.readLine()) != null)
		{
			System.out.println(s); 	
			i++;
		}
		//This will read everytime we call this 
		//System.out.println(rd.readLine()); 	//1st call line and set pointer to next line
		//System.out.println(rd.readLine());	//2nd
		//System.out.println(rd.readLine());	//3rd
		//System.out.println(rd.readLine());	//4th
		//System.out.println(rd.readLine());	//5th
		//System.out.println(rd.readLine());	//nothing 
		//System.out.println(rd.readLine());	//nothing
	}
}
