package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
        Thread.sleep(5000);
        driver.findElement(By.name("username")).sendKeys("9550");
        driver.findElement(By.name("password")).sendKeys("xxxxx");
        driver.findElement(By.id("loginBTN")).click();
        Thread.sleep(5000);
        
        driver.findElement(By.xpath("//*[text()='Send SMS']")).click();
        
        
        
        
	}

}

