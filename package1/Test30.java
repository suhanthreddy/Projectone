package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test30 {

	public static void main(String[] args) throws Exception 
	{

		// Launch site
				System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://www.gmail.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
				Thread.sleep(5000);
				//Do login
				driver.findElement(By.name("identifier")).sendKeys("suxxxxxxxx");
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(5000); 
				driver.findElement(By.name("password")).sendKeys("Lxxxxxxxx");
			    driver.findElement(By.xpath("//*[text()='Next']")).click();
				Thread.sleep(5000);
				// Goto 7 th mail in mail box table & select checkbox
				driver.findElement(By.xpath("(//table)[6]/tbody/tr[7]/td[2]/div")).click();
				Thread.sleep(5000);
				//delete mail
				driver.findElement(By.xpath("//*[@gh='mtb']/div/div/div/child::div[3]")).click();
				Thread.sleep(4000);
				// Do logout
				driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
				Thread.sleep(3000);
				driver.findElement(By.linkText("Sign out")).click();
				Thread.sleep(4000);
				//close site
				driver.close();
				
				
	}
				
				
			

}
