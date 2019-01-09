package package1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test120239 
{

	public static void main(String[] args)
	{
     String x="India won 2011 WOrld2008 cup";
     //prepare regexp
     Pattern p=Pattern.compile("[A-Z]+[a-z]+[0-9]+");
     Matcher m=p.matcher(x);
     while(m.find())
      {
    	 System.out.print(m.group()+" ");
      }
	}

}
