package package1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		//click on element
		driver.findElement(By.xpath("//*[contains(@src,'android-button.png')]")).click();
		Thread.sleep(5000);
		ArrayList<String> x=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(x.get(1));
		driver.close();
		driver.switchTo().window(x.get(0));
		

		
		
		
	}

}
