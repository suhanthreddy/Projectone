package package1;

public class Test115 
{

	public static void main(String[] args) 
	{
       Myinterface obj1=new Myconcrete();
       int o1=obj1.add(22,11);
       System.out.println(o1);
       Myconcrete obj2=new Myconcrete();
       int o2=obj2.add(22, 11);
       System.out.println(o2);
		
	}

}
