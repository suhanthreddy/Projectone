package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		
		String x=driver.getPageSource();
		System.out.println(x);
		
	}

}
