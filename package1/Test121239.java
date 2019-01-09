package package1;

import java.util.Scanner;

public class Test121239 
{

	public static void main(String[] args) 
	{
	//Declare 5 number static array
	int x[]=new int[5];
	//store 5 number into array
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<5;i++)
	    {
		 System.out.println("Enter"+(i+1)+"Number");
		 x[i]=sc.nextInt();
	    }
	//sorting
	for(int i=0;i<5;i++)
     	{
		for(int j=0;j<4;j++)
		  {
			if(x[j]<x[j+1])
			{
				int temp=x[j];
				x[j]=x[j+1];
				x[j+1]=temp;
			}
		  }
	    }
     //Display array numbers after sorting
	for(int i=0;i<5;i++)
	{
		System.out.print(x[i]+" ");
	}
	}

}
