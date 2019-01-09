package package1;

import java.util.HashMap;
import java.util.Map;

public class Test125239 
{

	public static void main(String[] args)
	{
     // create hashmap
		HashMap<Integer,String> x=new HashMap<Integer,String>();
		//Insert data as pairs
		x.put(100,"sachin");
		x.put(101,"virat");
		x.put(102, "batch240");
		//change value depends on key
		x.put(102, "suhanth");
		//change key
		x.put(103,x.remove(102));
		//get pairs of data
		for(Map.Entry<Integer,String> e:x.entrySet())
		  {
			System.out.println(e.getKey()+"   "+e.getValue());
		  }
	}

}
