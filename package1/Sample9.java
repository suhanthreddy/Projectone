package package1;

public class Sample9 
{  
   //data member
   public int x; 
   //constructor method
   private Sample9()
   {
	   x=10;
   }
   //operational methods
    public static Sample9 create()
	{
		Sample9 obj=new Sample9();
		return(obj);
    }
    public void dispaly()
    {
    	System.out.println(x);
    }
	   
}
