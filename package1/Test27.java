package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 {

	public static void main(String[] args) throws Exception
	{
     // Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("sxxxxxxxxxxx");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.name("password")).sendKeys("Lxxxxxxxxxxx");
	    driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//Get count of mails in mail box table
		List<WebElement> l=driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
		System.out.println("Count of mails is" +l.size());
		// Do logout
		driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(4000);
		//close site
		driver.close();
		
		
		
		

		
		
	}

}
