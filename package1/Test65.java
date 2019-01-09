package package1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;

public class Test65 
{

	public static void main(String[] args) throws Exception
	{
		
	    
	    System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
	 	FirefoxDriver driver=new FirefoxDriver();	
	 	
		driver.get("https://www.seleniumhq.org/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Download")));
		driver.findElement(By.linkText("Download")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("(//*[text()='3.13.0'])[1]")));
		driver.findElement(By.xpath("(//*[text()='3.13.0'])[1]")).click();
		//Automate file download pop-up window(Java Robot)
		Thread.sleep(4000);
		Robot r=new Robot();
		for (int k=1;k<=2;k++)
		{
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(4000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		Screen s=new Screen();
		s.click("download.png");
		//wait for complete download(sikulix)
		while(2>1)
		{
			if(s.exists("close.png")!=null)
			{
				continue;
			}
			else
			{
				break;
			}
		}
		
		//close site
		driver.close();
	}
}
