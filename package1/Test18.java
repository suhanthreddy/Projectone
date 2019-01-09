package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18 {

	public static void main(String[] args)throws Exception
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		driver.findElement(By.name("password")).sendKeys("lxxxxxx1");
		driver.findElement(By.id("loginBTN")).click();
		String x=driver.switchTo().alert().getText();
		
		System.out.println(x);
		driver.close();
		
	}

}
