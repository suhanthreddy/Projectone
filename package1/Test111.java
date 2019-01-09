package package1;

import java.util.Scanner;

public class Test111 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		String x=sc.nextLine();
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			switch(y) 
			{
			case'0':
			System.out.print("zero");
			break;
			case'1':
			System.out.print("one");
			break;

			case'2':
		      System.out.print("Two");
				break;

			case'3':
			System.out.print("Three");
			break;

			case'4':
				System.out.print("Four");
				break;

			case'5':
				System.out.print("Five");
				break;

			case'6':
				System.out.print("six");
				break;

			case'7':
				System.out.print("seven");
				break;

			case'8':
				System.out.print("Eight");	
				break;

			case'9':
				System.out.print("Nine");
				break;			
			} //close switch loop
		}//close for loop

	}

}
