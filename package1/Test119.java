package package1;

public class Test119
{

	public static void main(String[] args) 
	{
	   Parent p=new Parent();
	   p.x=20;
	   p.method1();
	   Child c=new Child();
	   c.x=20;  //parent property
	   c.y=45;
	   c.method1(); //parent method
	   c.method2();
	}

}
