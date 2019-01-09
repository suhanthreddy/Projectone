package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48 
{

	public static void main(String[] args) throws Exception
	{
		//Launch site (Disable an element in page)
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(5000);
		/*
		//way-1
		driver.executeScript("document.getElementsByName('q')[0].setAttribute('disabled',true);");
		Thread.sleep(8000);
		driver.executeScript("document.getElementsByName('q')[0].removeAttribute('disabled');");
		

		//way-2  
		           
        WebElement e=driver.findElement(By.name("q"));
        driver.executeScript("arguments[0].setAttribute('disabled',true);",e );
        Thread.sleep(5000);
        driver.executeScript("arguments[0].removeAttribute('disabled');",e);
       
        
        //way-3
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('q')[0].setAttribute('disabled',true);");
		Thread.sleep(4000);
		js.executeScript("document.getElementsByName('q')[0].removeAttribute('disabled');");
		  */
		
		
		//way-4
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('disabled',true);",e );
        Thread.sleep(5000);
        js.executeScript("arguments[0].removeAttribute('disabled');",e );
        driver.close(); 
	}
	
}
