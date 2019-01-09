package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test202 
{

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
        driver.get("http://www.way2sms.com/");
        //login site
        driver.findElement(By.name("mobileNo")).sendKeys("9550139255");
        driver.findElement(By.name("password")).sendKeys("Liviya31441");
        driver.findElement(By.xpath("Login")).click();
        
        
        
	}

}
