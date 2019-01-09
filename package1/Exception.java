package package1;

public class Exception 
{

	public static void main(String[] args) 
	{
	int z;
	try
	{
		int x=0;
		int y=10;
		z=y/x;
	}
	catch(ArithmeticException ex)
	{
		z=0;
	}
	System.out.println(z);
	System.out.println("hi");

	}

	public char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
