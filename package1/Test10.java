package package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(5000);
		String t=driver.getTitle();
		System.out.println(t);
        driver.close();
        
		
		
	}

}
