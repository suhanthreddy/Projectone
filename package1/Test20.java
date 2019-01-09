package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20 
{

	public static void main(String[] args)  throws Exception 
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(4000);
		try
		{
		if(driver.findElement(By.xpath("//*[@name='hiddenPassword']")).isDisplayed())
		 { 
			System.out.println("Visible in page");
		 }
		else
		 {
			System.out.println("Not visible in page");
			
		 }
		}
		catch(Exception e)
		{ 
			System.out.println("No element in soure code");
			
		}
			
	}
}
