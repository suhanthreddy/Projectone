package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[] args) 
	{
		// Launch site
	    System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    List<WebElement> l=driver.findElements(By.xpath("//input[@type='text']"));
	    System.out.println("count of text boxes is"+l.size());
	    driver.close();
		
		
	}

}
