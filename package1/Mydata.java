package package1;

import org.testng.annotations.DataProvider;

public class Mydata 
   {
      @DataProvider(name="searchword")
      public static Object[][] testdata()
      {
    	  return new Object[][]
    	  {
    		  {"kalam"},
    		  {"telangana"}	  
   		};
      }
   }
