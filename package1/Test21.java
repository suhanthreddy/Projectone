package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21 {

	public static void main(String[] args) throws Exception
	{

	//Launch site
		System.setProperty("webdriver.chrome.driver",
				"E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://goindigo.in");
		Thread.sleep(5000);
		//validate radio button
	     try 
		{
			WebElement e=driver.findElement(By.xpath("(//*[@for='oneway-trip-armForce'])[2]/preceding-sibling::*[1]"));
			if(e.isDisplayed())
			{
				if(e.isEnabled())
				{
					if(e.isSelected())
					{
						System.out.println("Selected");
					}
					else
					{
						System.out.println("Not Selected");
					}
				} 
				else
				{
					System.out.println("Not Enabled");
				}	
			}
			else
			{
				System.out.println("Not visible");
			}
		}
		catch(Exception ex)
	     {
			System.out.println("Wrong element");
	     }
	     //close site 
	     //driver.close();
	}

}
