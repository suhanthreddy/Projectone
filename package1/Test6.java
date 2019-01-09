package package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;

public class Test6 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=null;//Object Declaration
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Browser Name");
	    String x=sc.nextLine();
	    // open our interested browser
	    if(x.equalsIgnoreCase("chrome"))
	    {
	    	System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
			driver=new ChromeDriver(); //object defined
	    }
	    else if(x.equalsIgnoreCase("firefox"))
	    {
	    	System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
	 		driver=new FirefoxDriver(); //object defined
	    }
	    else if(x.equalsIgnoreCase("ie"))
	    {
	    	System.setProperty("webdriver.ie.driver","E:\\SDET\\iedriverserver.exe");
	    	driver=new InternetExplorerDriver();   //object defined
	    }
	    else if(x.equalsIgnoreCase("opera"))
	    {
	    	OperaOptions o=new OperaOptions();
			o.setBinary("C:\\Program Files\\Opera\\54.0.2952.41\\opera.exe");
            System.setProperty("webdriver.opera.driver","E:\\SDET\\operadriver_win64\\operadriver.exe");
            driver=new OperaDriver(o);
	    }
	    else
	    {
	    	System.out.println("Invalid Browser");
	    	System.exit(0);  // 0 means forcibly
	    }
	    //Launch site
		driver.get("http://newtours.demoaut.com");
		Thread.sleep(4000);
		//click on register link
		driver.findElement(By.linkText("REGISTER")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("firstName")).sendKeys("abdhul");
		driver.findElement(By.name("lastName")).sendKeys("kalam");
		driver.findElement(By.name("phone")).sendKeys("165561561");
		driver.findElement(By.name("userName")).sendKeys("apj@abdhulkalam.com");
		driver.findElement(By.name("address1")).sendKeys("Mosque street");
		driver.findElement(By.name("address2")).sendKeys("Dhanushkoti road");
		driver.findElement(By.name("city")).sendKeys("Rameshwaram");
		driver.findElement(By.name("state")).sendKeys("TN");
		driver.findElement(By.name("postalCode")).sendKeys("600072");
		
		WebElement e=driver.findElement(By.name("country"));
		Select s=new Select(e);
		s.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("apj@240");
		driver.findElement(By.name("password")).sendKeys("600072");
		driver.findElement(By.name("confirmPassword")).sendKeys("600072");
		driver.findElement(By.name("register")).click();
		Thread.sleep(10000);
		//driver.close();
		

		
        		
        
	}

}
