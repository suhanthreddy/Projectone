package package1;

import java.util.Scanner;

public class Primenumber
{

	public static void main(String[] args)
	{
		//Get a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
			}
			
		}
		if(flag==0)
		{
			System.out.println(n+ "is prime number");
		}
		else
		{
			System.out.println(n+"is not prime number");
		}
	}

}
