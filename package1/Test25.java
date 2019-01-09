package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {

	public static void main(String[] args) 
	{
		// Launch site
	    System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("https://www.goindigo.in");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	    // Get all text boxes
	    List<WebElement> l=driver.findElements(By.tagName("input"));

	    int tbc=0;
	    for(int i=0;i<l.size();i++)
	    {
	    	String x=l.get(i).getAttribute("type");
	    	if(x.equals("text"))
	    	{
	    		tbc=tbc+1;
	    	}
	    }
	    System.out.println("count of text boxes is"+tbc);
	}

}
