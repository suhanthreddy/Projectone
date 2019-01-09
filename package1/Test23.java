package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test23 {

	public static void main(String[] args)
	{
	//Launch site
     System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
     ChromeDriver driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
     driver.manage().deleteAllCookies();
    //open site
     driver.get("https://www.facebook.com");
    //validate cookies were loaded
     if(driver.manage().getCookies().size()!=0)
     {
    	 System.out.println("cookies were loaded");
     }
     else
     {
    	 System.out.println("cookies were not loaded");

     }
     	//close site
     driver.close();
     
	}

}
