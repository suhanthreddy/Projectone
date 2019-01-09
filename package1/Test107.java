package package1;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test107 
{

	public static void main(String[] args) throws Exception
	{

	//Get data
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mno=sc.nextLine();
		System.out.println("Enter criteria");
		String mnoc=sc.nextLine();
		System.out.println("Enter password");
		String p=sc.nextLine();
		System.out.println("Enter password criteria");
		String pc=sc.nextLine();
		//create html results
		ExtentReports er=new ExtentReports("way2smsresults.html",false);
		ExtentTest et=er.startTest("way2sms login Testing");
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/");
		Thread.sleep(4000);
		//Do login
		driver.findElement(By.name("mobileNo")).sendKeys(mno);
		driver.findElement(By.name("password")).sendKeys(p);
		driver.findElement(By.xpath("(//*[@type='button'])[2]")).click();
		//validations
		try
		{
			if(mno.length()==0 && driver.findElement(By.xpath("//*[text()='Enter your mobile number']")).isDisplayed())
			{
				et.log(LogStatus.PASS, "Blank mobile number test is passed");
			}
			else if(mno.length()<10 && driver.findElement(By.xpath("//*[text()='Enter valid mobile number']")).isDisplayed())
			{
				et.log(LogStatus.PASS, "wrong size mobile number test is passed");
			}
			else if(mnoc.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),'not register')])[1]")).isDisplayed())
			{
				et.log(LogStatus.PASS, "Invalid mobile number test passed");
			}
			else if(p.length()==0 && driver.findElement(By.xpath("(//*[text()='Enter password'])[2]")).isDisplayed())
			{
				et.log(LogStatus.PASS, "Blank paassword test passed");
			}
			else if(pc.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),' or password! Try Again.')])[1]")).isDisplayed())
			{
				et.log(LogStatus.PASS, "Invalid password test passed");			
			}
			else if(mnoc.equals("valid") && pc.equals("valid") && driver.findElement(By.xpath("//*[text()='Send SMS']")).isDisplayed())
			{
				et.log(LogStatus.PASS, "valid mno and pswd test passed");
			}
			else
			{
				// get screen shot if conditions are wrong
				   SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
				   Date d=new Date();
				   String ssname=sf.format(d);
				   File src=driver.getScreenshotAs(OutputType.FILE);
				   File dest=new File(ssname+ ".png");
				   FileUtils.copyFile(src, dest);
				   et.log(LogStatus.FAIL,"way2 sms login test Failed"+et.addScreenCapture(ssname+".png"));  
			}
			
		}
		catch(Exception ex)
		{
			// get scrrenshot if any code or project problem
			SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			   Date d=new Date();
			   String ssname=sf.format(d);
			   File src=driver.getScreenshotAs(OutputType.FILE);
			   File dest=new File(ssname+ ".png");
			   FileUtils.copyFile(src, dest);
			   et.log(LogStatus.ERROR,"way2 sms login test interrupted"+et.addScreenCapture(ssname+".png")); 	
		}
		//close site
		driver.close();
		//save and close results
		er.endTest(et);
		er.flush();
	}

}
