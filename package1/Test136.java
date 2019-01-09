package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Testlisteners.class)
public class Test136 
{
	public ChromeDriver driver;
    @Test()
    public void launch()
    {
	System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
	driver   =   new ChromeDriver();
	driver.get("http://www.gmail.com");
    }
    @AfterMethod
    public void close() throws InterruptedException
    {
    Thread.sleep(5000);
    driver.close();
    }
   
	
}
