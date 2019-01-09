package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test16 {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);

driver.get("http://www.way2sms.com/content/index.html?");


driver.findElement(By.name("username")).sendKeys("95xxxx");
driver.findElement(By.name("password")).sendKeys("xxxxxxx");
driver.findElement(By.id("loginBTN")).click();

driver.findElement(By.xpath("//*[contains(@href,'javascript:loadSMSPage')]")).click();
driver.switchTo().frame("frame");

driver.findElement(By.name("mobile")).sendKeys("9xxxxxxx");
driver.findElement(By.name("message")).sendKeys("Hi via Selenium Test");
driver.findElement(By.name("Send")).click();
Thread.sleep(5000);
driver.switchTo().defaultContent();
//click on language sms link
driver.findElement(By.xpath("//*[contains(@href,'javascript:loadSMSPage')]")).click();

Thread.sleep(5000);
driver.close();

	}
}
