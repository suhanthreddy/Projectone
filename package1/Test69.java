package package1;

import java.io.File;
import java.net.URL;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class Test69 {

	public static void main(String[] args) throws Exception
	{
     //Take two inputs from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input1");
		String x=sc.nextLine();
		System.out.println("Enter input2");
		String y=sc.nextLine();
		//Provide details of AVD and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName","android");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\" ");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//create object to AndroidDriver to launch app
		AndroidDriver driver;
		while(2>1)
		{
			try
			{
				driver=new AndroidDriver(u,dc);
				break;
			}
			catch(Exception ex)
			{	
			}
		}
		//Automation
		try
		{
			WebDriverWait w=new WebDriverWait(driver,20);
			w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@text='9']")));
			//Enter input 1
			for(int i=0;i<x.length();i++)
			{
				char d=x.charAt(i);
				driver.findElement(By.xpath("//*[@text='"+d+"']")).click();
				
			}
			//click +
			driver.findElement(By.xpath("//*[@content-desc='plus']")).click();
			//Enter input 2
			for(int i=0;i<y.length();i++)
			{
				char d=y.charAt(i);
				driver.findElement(By.xpath("//*[@text='"+d+"']")).click();
			}
			//click equals
			driver.findElement(By.xpath("//*[@content-desc='equals']")).click();
			//Get output
			String z=driver.findElement(By.xpath("//*[@class='android.widget.EditText']")).getAttribute("text");
			
			if(Integer.parseInt(z)==Integer.parseInt(x)+Integer.parseInt(y))
			{
				System.out.println("Test passed");
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File("passscreenshot.png");
				FileUtils.copyFile(src, dest);
			}
			else
			{
				System.out.println("Test Failed");
				File src=driver.getScreenshotAs(OutputType.FILE);
				File dest=new File("Failedscreenshot.png");
				FileUtils.copyFile(src, dest);
			}
			//close app
			driver.closeApp();
		}
		catch(Exception ex)
		{
		 System.out.println(ex.getMessage());		
		}
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exec");
	}
}
