package package1;

import java.util.Scanner;

public class Test122239 
{

	public static void main(String[] args) 
	{
			//Declare 5 number static array
			 String x[]=new String[5];
			//Fill array with 5 strings
			Scanner sc=new Scanner(System.in);
			for(int i=0;i<5;i++)
			    {
				 System.out.println("Enter"+(i+1)+"Word");
				 x[i]=sc.nextLine();
			    }
			//sorting
			for(int i=0;i<5;i++)
		     	{
				for(int j=0;j<4;j++)
				  {
					if(x[j].compareTo(x[j+1])>0)
					{
						String temp=x[j];
						x[j]=x[j+1];
						x[j+1]=temp;
					}
				  }
			    }
		     //Display array strings after sorting
			for(int i=0;i<5;i++)
			{
				System.out.print(x[i]+" ");
			}	
	}
}
