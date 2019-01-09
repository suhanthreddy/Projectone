package package1;

import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class Test82 
{

	public static void main(String[] args) throws Exception
	{
		//Provide details of AVD and app
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME, "");
		dc.setCapability("deviceName", "emulator-5554");
		dc.setCapability("platformName", "android");
		dc.setCapability("platformVersion", "4.2.2");
		dc.setCapability("appPackage", "com.android.calendar");
		dc.setCapability("appActivity", "com.android.calendar.AllInOneActivity");
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
     //swipe on app screen
	int w=driver.manage().window().getSize().getWidth();
	int h=driver.manage().window().getSize().getHeight();
	TouchAction ta=new TouchAction(driver);
	//swipe from right to left 3 times
	int x1=(int)(w*0.9);//near to right edge
	int y1=(int)(h/2);
	int x2=(int)(w*0.3); // near to left edge
    int y2=(int)(h/2);
    for(int i=1;i<=3;i++)
         {
           Duration d=Duration.of(3, ChronoUnit.SECONDS);
           ta.press(x1, y1).moveTo(x2,y2).waitAction(d).release().perform();
         }
	// swipe from left to right
    x1=(int)(w*0.3); //near to left edge
    x2=(int)(w*0.8);// near to left edge
    for(int i=1;i<=3;i++)
    {
      Duration d=Duration.of(3, ChronoUnit.SECONDS);
      ta.press(x1, y1).moveTo(x2,y2).waitAction(d).release().perform();
    }
    //close app
    driver.closeApp();
    //close appium server
    Runtime.getRuntime().exec("taskkill /F /IM node.exe");
    Runtime.getRuntime().exec("taskkill /F /IM cmd.exe");
	}
}
