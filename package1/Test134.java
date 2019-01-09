package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Test134 
{
	 public ChromeDriver driver;
	    @Test
	    public void launch()
	    {
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		driver   =   new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    }
	    @AfterMethod
	    public void close() throws InterruptedException
	    {
	    	Thread.sleep(5000);
	    driver.close();

	    }
}
