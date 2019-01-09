package package1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class W2smsmethods   
{
    public WebDriver driver;
    public WebDriverWait wait;
    public String launch(String e, String d, String c) 
    {
		if(e.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
			driver=new ChromeDriver(); //object defined
		}
		else if(e.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
	 		driver=new FirefoxDriver(); //object defined
		}
		else if(e.equals("ie"))
		{
			System.setProperty("webdriver.ie.driver","E:\\SDET\\iedriverserver.exe");
	    	driver=new InternetExplorerDriver();   //object defined
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
			return("Unknown browser");
		}
		driver.get(d);
		wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("mobileNo")));
		driver.manage().window().maximize();
		return("Done");
    }
    public String fill(String e, String d, String c)
    {
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
    	driver.findElement(By.xpath(e)).sendKeys(d);
    	return("Done");
    }
	public String click(String e, String d, String c)
	{
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(e)));
    	driver.findElement(By.xpath(e)).click();
    	return("Done");
	}
	public String validtelogin(String e, String d, String c) throws IOException 
	{
		//try
		{
			if(c.equals("all_valid") && driver.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
			{
				return("passsed");
			}
			else if(c.equals("mbno_blank") && driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("mbno_invalid") && driver.findElement(By.xpath("//*[text()='Enter valid mobile number']")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_blank") && driver.findElement(By.xpath("(//*[text()='Enter password'])[1]")).isDisplayed())
			{
				return("passed");
			}
			else if(c.equals("pwd_inavalid") && driver.findElement(By.xpath("//*[text()='Incorrect number or password! Try Again.']")).isDisplayed())
			{
				return("passed");
			}
			else
			{
				String temp=this.screenshot();
				return("Tesst failed & goto "+temp+".png");
			}
		}
		//catch(Exception ex)
	//	{
	//		String temp=this.screenshot();
	//		return("Test interrupted & goto "+temp+".png");
	//	}
	}
	public String closesite(String e, String d, String c )
	{
		driver.close();
		return("Done");
	}
	public String screenshot() throws IOException  
	{
       Date dt=new Date();
       SimpleDateFormat df=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
       String ssname=df.format(dt);
       File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File dest=new File(ssname+".png");
       FileUtils.copyFile(src, dest);
       return(ssname);
	}
}
