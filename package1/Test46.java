package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test46 
{

	public static void main(String[] args)  throws Exception 
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        /*
		//way-1
        driver.findElement(By.name("q")).sendKeys("kalam");
        //way-2
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("kalam");
		//way-3
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.name("q"));
		a.sendKeys("kalam").build().perform();  
		//way-4
		driver.executeScript("document.getElementsByName('q')[0].value='kalam';"); 
		//way-5
		WebElement e=driver.findElement(By.name("q"));
		driver.executeScript("arguments[0].value='kalam';",e);     
		//way-6
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('q')[0].value='kalam';");   */
		//way-7
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].value='kalam';",e);
		
		
		
		
		
		
        
	}

}
