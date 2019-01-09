package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test42 
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
		//open multi-select drop down(mandatory)
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("(//*[contains(@class,' selection multiple')])[1]"));
		a.click(e).build().perform();
		Thread.sleep(5000);
		//Get all items in drop down
		List<WebElement> li=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
		System.out.println(li.size());
		
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		// select multiple items in drop down
		
		/*driver.findElement(By.xpath("(//*[contains(text(),'UI Design')])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//*[contains(text(),'Graphic Design')])[2]")).click();
		Thread.sleep(4000);
		// deselect Graphic Design 
		driver.findElement(By.xpath("(//*[@class='ui label transition visible'])[2]/i")).click();
		
		Thread.sleep(5000);
		//close site
		driver.close();    */
		
		//select multiple items in drop down
		driver.findElement(By.xpath("//*[@class='menu transition visible']/div[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='menu transition visible']/div[11]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@class='menu transition visible']/div[18]")).click();
		Thread.sleep(4000);
		//De-select one item
		driver.findElement(By.xpath("//*[contains(@class,'multiple upward active visible')or contains(@class,'multiple active visible')]/a[1]/i")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[contains(@class,'multiple upward active visible')or contains(@class,'multiple active visible')]/a[2]/i")).click();
		Thread.sleep(4000);
		//close site
		driver.quit();
	}
}
