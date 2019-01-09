package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Test54
{

	public static void main(String[] args) 
	{
		// Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demos.telerik.com/aspnet-ajax/ajaxloadingpanel/functionality/explicit-show-hide/defaultcs.aspx");
		//explicit wait to maximize
		FluentWait w=new FluentWait(driver);
		w.withTimeout(20,TimeUnit.SECONDS);
		w.pollingEvery(5, TimeUnit.SECONDS);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.className("rcMainTable")));
		driver.manage().window().maximize();
		//close site
		driver.close();
	}

}
