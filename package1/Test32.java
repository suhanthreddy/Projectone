package package1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.support.ui.Select;

public class Test32 {

	public static void main(String[] args) throws Exception
	{

		System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement e=driver.findElement(By.name("nights"));
		Select s=new Select(e);
		List<WebElement> l=s.getOptions();
		System.out.println(l.size());
        for(int i=0;i<l.size();i++)
        {
        	System.out.println(l.get(i).getText());	
        }
        driver.close();
	}
	
}
