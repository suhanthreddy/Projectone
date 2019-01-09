package package1;

public class Test129 
{

    public void 
	finalize()
	{
		System.out.println("seheri");
	}
	public static void main(String[] args) 
	   {
		Test129 f1=new Test129();
		Test129 f2=new Test129();
		f1=null;
		f2=null;
		System.gc();
		
	   }
	
	

}
