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

public class Test108 
{

	public static void main(String[] args) throws Exception
	{
     //Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter user id");
		String u=sc.nextLine();
		System.out.println("Enter user id criteria");
		String uc=sc.nextLine();
		String p="";
		String pc="";
		if(uc.equals("valid"))
		{
			System.out.println("Enter password");
			p=sc.nextLine();
			System.out.println("Enter password criteria");
			pc=sc.nextLine();
		}
		//create html results file
		ExtentReports er=new ExtentReports("Gmailresults.html",false);
		ExtentTest et=er.startTest("Gmail login testing");
		//Launch site
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://gmail.com");
		Thread.sleep(4000);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys(u);
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(4000);
		//validations
		try
		{
			//user id testing
			if(u.length()==0 && driver.findElement(By.xpath("//*[contains(text(),'email or phone number')]")).isDisplayed())
			{
				et.log(LogStatus.PASS,"Blank uid test passed");
			}
			else if(uc.equals("invalid") && driver.findElement(By.xpath("(//*[contains(text(),' find your Google Account')])[2]")).isDisplayed())
			{
				et.log(LogStatus.PASS, "Invalid uid test passed");
			}
			else if(uc.equals("valid") && driver.findElement(By.name("password")).isDisplayed())
			{
				et.log(LogStatus.PASS, "valid uid test passed");
				//password testing
				driver.findElement(By.name("password")).sendKeys(p);
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(3000);
				if (p.length()==0 && driver.findElement(By.xpath("//*[(text()='Enter a password')]")).isDisplayed())
				{
					et.log(LogStatus.PASS,"Blank pswd test passed");
				}
				else if(pc.equals("invalid") && driver.findElement(By.xpath("//*[contains(text(),'Wrong password')]")).isDisplayed())
				{
					et.log(LogStatus.PASS, "Invalid password test passed");
				}
				else if(pc.equals("valid") && driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed())
				{
					et.log(LogStatus.PASS,"valid test passed");
				}
				else
				{
					//get screen shot if pswd test failed
      			   	SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
			        Date d=new Date();
			   	   String ssname=sf.format(d);
				   File src=driver.getScreenshotAs(OutputType.FILE);
				   File dest=new File(ssname+ ".png");
				   FileUtils.copyFile(src, dest);
				   et.log(LogStatus.FAIL,"pswd test failed"+et.addScreenCapture(ssname+".png")); 
				}
				
			}//else if closing
			else
			{
				//get screen shot if uid test failed
  			   	SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		        Date d=new Date();
		   	   String ssname=sf.format(d);
			   File src=driver.getScreenshotAs(OutputType.FILE);
			   File dest=new File(ssname+ ".png");
			   FileUtils.copyFile(src, dest);
			   et.log(LogStatus.FAIL,"uid test failed"+et.addScreenCapture(ssname+".png")); 
			}
		}
		catch(Exception ex)
		{
			
				//get screen shot if any exception comes
  			   	SimpleDateFormat sf=new SimpleDateFormat("dd-MM-yy-hh-mm-ss");
		        Date d=new Date();
		   	   String ssname=sf.format(d);
			   File src=driver.getScreenshotAs(OutputType.FILE);
			   File dest=new File(ssname+ ".png");
			   FileUtils.copyFile(src, dest);
			   et.log(LogStatus.ERROR,"Gmail login test interrupted"+et.addScreenCapture(ssname+".png")); 	
		}
		//close site
		driver.close();
		//save results
		er.endTest(et);
		er.close();
	}

}
