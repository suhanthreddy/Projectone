package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test51
{

	public static void main(String[] args) throws Exception 
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//scroll to bottom
		driver.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(5000);
		//scroll to top
		driver.executeScript("window.scrollTo(document.body.scrollHeight,0);");
		Thread.sleep(5000);
		//scroll to specific element
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui header'])[14]"));
		driver.executeScript("arguments[0].scrollIntoview;",e);
		Thread.sleep(4000);
		//close site
		driver.close();
	}

}
