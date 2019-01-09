package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test36
{

	public static void main(String[] args) throws Exception
	{
		// Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
        // move to Element by using Actions class
        Actions a=new Actions(driver);
        WebElement e=driver.findElement(By.xpath("(//*[contains(text(),'Women')])[1]"));
        Thread.sleep(4000);
        a.moveToElement(e).build().perform();
        
        
	}

}
