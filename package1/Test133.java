package package1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test133 
{
	
    public ChromeDriver driver;
    @Test(priority=1,invocationCount=3,threadPoolSize=3)
    public void launch()
    {
	System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
	driver   =   new ChromeDriver();
	driver.get("http://www.gmail.com");
    }
    @Test(priority=2,invocationCount=3,threadPoolSize=3)
    public void close() throws InterruptedException
    {
    Thread.sleep(5000);
    driver.close();
    }
}