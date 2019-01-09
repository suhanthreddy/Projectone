package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test40 
{

	public static void main(String[] args) throws Exception 
	{
		//Launch site
				System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://jqueryui.com/slider/");
				Thread.sleep(5000);
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//Automate horizontal slider
				driver.switchTo().frame(0);
				Actions a=new Actions(driver);
				WebElement e1=driver.findElement
						(By.xpath("//*[contains(@class,'ui-slider-handle ui-corner-all ui-state-default')]"));
				//slider from left to right
				a.dragAndDropBy(e1,150,0).build().perform();
				Thread.sleep(5000);
				a.dragAndDropBy(e1,-150,0).build().perform();
				//Back to page
				driver.switchTo().defaultContent();
				//click on vertical slider
				driver.findElement(By.linkText("Vertical slider")).click();
				Thread.sleep(5000);
				//Automate vertical slider
				driver.switchTo().frame(0);
                WebElement e2=driver.findElement
                		(By.xpath("//*[contains(@class,'ui-slider-handle ui-corner-all ui-state-default']"));
				a.dragAndDropBy(e2,0,50).build().perform();
                Thread.sleep(5000);
				a.dragAndDropBy(e2,0,-150).build().perform();
				//Back to page
				driver.switchTo().defaultContent();
				//close site
				driver.close();           
	}
}
