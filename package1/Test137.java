package package1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test137 
{
   public WebDriver driver;
   @Test(priority=0)
   @Parameters({"browser"})
   public void launch(String e) throws InterruptedException 
   {
	   if(e.equals("chrome"))
	   {
		   System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
			driver=new ChromeDriver(); 
		}
	   else if(e.equals("firefox"))
	   {
		   System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
	 		driver=new FirefoxDriver(); 
	   }
	   else if(e.equals("ie"))
	   {
		   System.setProperty("webdriver.ie.diver","E:\\SDET\\iedriverserver.exe");
		   driver=new InternetExplorerDriver();
	   }
	   else if(e.equals("opera"))
	   {
		   OperaOptions o=new OperaOptions();
			o.setBinary("C:\\Program Files\\Opera\\54.0.2952.41\\opera.exe");
           System.setProperty("webdriver.opera.driver","E:\\SDET\\operadriver_win64\\operadriver.exe");
           driver=new OperaDriver(o);
	   }
	   else
	   {
		   Assert.assertTrue("Unknown browser",false);
	   }
	   driver.get("https://www.google.com/");	  
	   Thread.sleep(4000);
   }
   @Test(priority=1)
   @Parameters({"searchword"})
   public void search(String x) throws InterruptedException
   {
	   driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
	   Thread.sleep(6000);
   }
   @Test(priority=2)
   public void close()
   {
	   driver.close();
   }
}
