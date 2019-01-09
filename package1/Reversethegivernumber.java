package package1;

import java.util.Scanner;

public class Reversethegivernumber 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		int y=0;
		while(x>0) //infinite loop up to x>0
		{
			int d=x%10;
			y=y*10+d;
			x=x/10;
		}
         System.out.println(y);
	}

}
