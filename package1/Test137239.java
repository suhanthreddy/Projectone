package package1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test137239 
{
	public ChromeDriver driver;
	@BeforeMethod
	public void launch() throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(4000);
	}
	@Test()
	@Parameters({"searchword"})
    public void search(String x) throws InterruptedException, IOException  
    {
    	driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
    	Thread.sleep(5000);
    	String t=driver.getTitle();
    	if(t.contains(x))
    	{
          Assert.assertTrue("Google title test passed",true);
    	}
    	else
    	{
    		Date d=new Date();
    		SimpleDateFormat dt=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
    		String ssname=dt.format(d);
    		File src=driver.getScreenshotAs(OutputType.FILE);
    		File dest=new File(ssname+".png");
    		FileUtils.copyFile(src, dest);
    		String Path="<img src=\"file:///E:\\SDET\\project1\\"+ssname+".png\" alt=\"\"/>";
    		Reporter.log(Path);
    		Assert.assertTrue("Google title test failed",false);
    	}
    }
	@AfterMethod
	public void close()
	{
		driver.close();
	}
 
	  
  
}
