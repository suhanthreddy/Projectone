package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test41 
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
		//open drop down(mandatory)
		Actions a=new Actions(driver);
		WebElement e=driver.findElement(By.xpath("(//*[@class='ui dropdown'])[1]"));
		a.click(e).build().perform();
		Thread.sleep(5000);
		//get all items
		List<WebElement> l=driver.findElements(By.xpath("//*[@class='menu transition visible']/div"));
		System.out.println(l.size());
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
		}
		Thread.sleep(4000);
		//select 4th item in that single select drop down
		driver.findElement(By.xpath("//*[@class='menu transition visible']/div[4]")).click();
		Thread.sleep(5000);
		//close site
		driver.close();
	}

}
