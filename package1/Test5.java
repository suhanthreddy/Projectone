package package1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.support.ui.Select;

public class Test5 
{

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
	    driver.get("https://www.google.com/");
	}
}
