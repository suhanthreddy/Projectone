package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Test34 
{

	public static void main(String[] args) throws Exception 
	{
     
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    //switch to frames
	    driver.switchTo().frame("iframeResult");  
	    WebElement e=driver.findElement(By.name("cars"));
	    Select s=new Select(e);
	    Actions a=new Actions(driver);
	    //select multiple items
	    a.keyDown(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		a.click(s.getOptions().get(3)).build().perform();
		Thread.sleep(4000);
		a.click(s.getOptions().get(0)).build().perform();
		a.keyUp(Keys.META).build().perform();
		//get first selected item
		String x=s.getFirstSelectedOption().getText();
		System.out.println(x);
		//get all selected items 
		List<WebElement> sl=s.getAllSelectedOptions();
		for(int i=0;i<sl.size();i++)
		{
			System.out.println(sl.get(i).getText());
		}
		//De-select item
		Thread.sleep(5000); 
		s.deselectByVisibleText("Volvo");
		//Back to page and close site
		driver.switchTo().defaultContent();
		Thread.sleep(5000); 
		driver.close();
	}
}
