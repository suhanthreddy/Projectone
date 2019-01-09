package package1;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Test81 
{

	public static void main(String[] args) throws Exception
	{
		//Provide details of AVD and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.deskclock");
		dc.setCapability("appActivity", "com.android.deskclock.DeskClock");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		
		//start appium server
		Runtime.getRuntime().exec("cmd.exe /c start cmd.exe /k \"appium -a 0.0.0.0 -p 4723\"");
		URL u=new URL("http://0.0.0.0:4723/wd/hub");
		//create object to Android driver to launch App
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
        //open cities in that app
		WebDriverWait wt=new WebDriverWait(driver,20);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@content-desc='Cities']")));
		driver.findElement(By.xpath("//*[@content-desc='Cities']")).click();
		//perform swipe for required element(city)
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		TouchAction ta=new TouchAction(driver);
		//swipe from bottom to top for required city
		int x1=(int)(w/2);
		int y1=(int)(h*0.9);//near to bottom
		int x2=(int)(w/2);
		int y2=(int)(h*0.4);//near to center from top
		while(2>1)// infinte loop
		{ 
			try
			{
				driver.findElement(By.xpath("//*[@text='Baghdad']")).click();
				break; //to terminate from current loop
			}
			catch(Exception ex)
			{
				Duration d=Duration.of(2, ChronoUnit.SECONDS);
				ta.press(x1,y1).waitAction(d).moveTo(x2, y2).release().perform();
			}
		}
		//swipe from top to bottom for required city
		y1=(int)(h*0.3); //near to top
		y2=(int)(h*0.7);// near to centre from bottom
		while(2>1)
		{ 
			try
			{
				driver.findElement(By.xpath("//*[@text='Abidjan']")).click();
				break; //to terminate from current loop
			}
			catch(Exception e)
			{
				Duration d=Duration.of(2, ChronoUnit.SECONDS);
				ta.press(x1,y1).waitAction(d).moveTo(x2, y2).release().perform();
			}
		}
		//close app
		driver.closeApp();
		//stop appium server
		Runtime.getRuntime().exec("taskkill /F /IM node.exe");
		Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
		
		
	}

}
