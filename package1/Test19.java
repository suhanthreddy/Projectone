package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test19 {

	public static void main(String[] args) throws Exception
	
	{

		
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.way2sms.com/content/index.html?");
		Thread.sleep(6000);
		driver.navigate().to("http:/www.facebook.com");
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		driver.close();
		
		
	
		
	}

}
