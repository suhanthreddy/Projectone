package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test61 
{

	public static void main(String[] args) 
	{
		// Launch site
		//System.setProperty("webdriver.ie.driver", "E:\\SDET\\iedriverserver.exe");
		//InternetExplorerDriver driver=new InternetExplorerDriver();
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("input.inputtext")).sendKeys("suhanth");
        driver.findElement(By.cssSelector("input[name=pass]")).sendKeys("kjdshjds");
        driver.findElement(By.cssSelector("input[value=Log In]")).click();
       
	}

}
