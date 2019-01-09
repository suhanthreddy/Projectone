package package1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test60 
{

	public static void main(String[] args) 
	{
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    //to get tooltips of the rotate button 
	    String x=driver.findElement(By.xpath("(//*[@href='javascript:void(0);'])[5]")).getAttribute("title");
	    System.out.println(x);
	    

	}

}
