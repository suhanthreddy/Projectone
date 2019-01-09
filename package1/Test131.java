package package1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test131 
{

	public static void main(String[] args) throws IOException 
	{
		//open file in read mode	
	     File f1=new File("testdata.txt");
	     FileReader fr =new FileReader(f1);
	     BufferedReader br=new BufferedReader(fr);
	     for(int i=1;i<4;i++) // 3 times
	     {
	    	 br.readLine();
	     }
	     String l=br.readLine();
		System.out.println(l);
		
	}

}
