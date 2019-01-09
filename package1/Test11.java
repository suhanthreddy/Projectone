package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("secured");
		    }
		else
		    {
		System.out.println("Not secured");
		}
		driver.close();	
	}

}
