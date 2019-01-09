package package1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test130 
{

	public static void main(String[] args) throws IOException  
	{
	//open file in read mode	
     File f1=new File("testdata.txt");
     FileReader fr =new FileReader(f1);
     BufferedReader br=new BufferedReader(fr);
     //open another file for writing
     File f2=new File("testresult.txt");
     FileWriter fw=new FileWriter(f2);
     BufferedWriter bw=new BufferedWriter(fw);
     //Data driver
     String l="";// to get line from file
     int nol=0;
     int now=0;
     int non=0;
     while((br.readLine())!=null)
         {  
    	   nol=nol+1;   
    	   String[] p=l.split(" "); //divide to pieces based on space 
    	   now=now+p.length;
    	   Pattern pt=Pattern.compile("[0-9]+");
    	   Matcher m=pt.matcher(l);
    	   while(m.find())
    	   {
    		   non=non+1;
    	   }
         }
     //send out put file
     bw.write("No. of lines is"+nol);
     bw.newLine();
     bw.write("No. of words is"+now);
     bw.newLine();
     bw.write("No. of nemerics is"+non);
     br.close();
     fr.close();
     bw.close();
     fw.close();
		
		
	}

}
