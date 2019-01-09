package package1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 {

	public static void main(String[] args) throws Exception
	{
		// Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		//Do login
		driver.findElement(By.name("identifier")).sendKeys("sxxxxxxxx");
		driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000); 
		driver.findElement(By.name("password")).sendKeys("Lixxxxxxxxxxx");
	    driver.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		//Collect all mails in mailbox table
		List<WebElement> l1=driver.findElements(By.xpath("(//table)[6]/tbody/tr"));
	    int c=0;
		for(int i=1;i<=l1.size();i++)
		
		{
		  List<WebElement> l2=driver.findElements(By.xpath("(//table)[6]/tbody/tr["+i+"]/td"));
		  String x=l2.get(7).getText(); //8 th column value
		  
		  SimpleDateFormat f=new SimpleDateFormat("dd/MMM/yyyy");
		  Date d=new Date();
		  String y=f.format(d); //today date
		  if(x.contains("Jun"))
		  {
			  c=c+1;
		  }
		  else
		  {
			  if(y.contains("Jun")&&x.contains("am"))
			{
				c=c+1;  
		    }
		   else if(y.contains("Jun")&&x.contains("pm"))
				   {
			       c=c+1;
				   }
		  } 
		}	
		System.out.println("Count of june mails is "+c);
		// Do logout
		driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Sign out")).click();
		Thread.sleep(4000);
		//close site
		driver.close();
	}
}
