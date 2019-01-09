package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test50 
{

	public static void main(String[] args) throws InterruptedException
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://google.co.in");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//giving alert message (hi all )
		driver.executeScript("window.alert('hi all');");
		Thread.sleep(5000);
		//close site
		driver.close();
	}

}
