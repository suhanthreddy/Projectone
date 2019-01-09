package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		String x=driver.findElement(By.xpath("//*[@class='sbqs_c']")).getText();
		System.out.println(x);
		driver.close();
		
		
		

	}

}
