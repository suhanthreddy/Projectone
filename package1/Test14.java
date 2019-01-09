package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14 {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		String x=driver.findElement(By.xpath("//*[@class='RveJvd snByac']")).getText();
		System.out.println(x);
		driver.close();

		
		
		
	}

}
