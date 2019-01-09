package package1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test123239 
{

	public static void main(String[] args) throws Exception
	{
     ArrayList<String> x=new ArrayList<String>();
     //Fill array with strings
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter Size");
     int n=Integer.parseInt(sc.nextLine());
     for(int i=0;i<n;i++)
     {
    	 switch(i+1)
    	 {
    		 case 1:
    			 System.out.println("Enter 1st word");
    	         break;
    	     case 2:
        	     System.out.println("Enter 2nd word");
        	     break;    
            case 3:
        	     System.out.println("Enter 3rd word");
        	     break;	
        	 default:
        		 System.out.println("Enter"+(i+1)+"th word");
    	 }
    	 x.add(sc.nextLine()); 
     }
	//sorting	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<(n-1);j++)
		{
			if(x.get(j).compareToIgnoreCase(x.get(j+1))>0)
			{
				String temp=x.get(j);
				x.set(j,x.get(j+1));
				x.set(j+1,temp);
			}
		}
	}
	//Display array strings after sorting
	for(int i=0;i<n;i++)
	   {
	      System.out.println(x.get(i)+" ");
	   }
			
	}

}
