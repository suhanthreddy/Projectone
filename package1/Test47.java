package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test47
{

	public static void main(String[] args) throws Exception
	{
		//Launch site (Highlighting an element in page)
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Thread.sleep(5000);
		/*way-1
		driver.executeScript("document.getElementsByName('q')[0].style.border='2px yellow solid';");
		//way-2              
        WebElement e=driver.findElement(By.name("q"));
        driver.executeScript("arguments[0].style.border='3px black solid';",e );    
        //way-3
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("document.getElementsByName('q')[0].style.border='3px blue dashed';");
		*/
		//way-4
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px black solid';",e );  
        Thread.sleep(5000);
        driver.close();
	}
	
}
