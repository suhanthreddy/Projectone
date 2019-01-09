package package1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countnumberofresultpages
{

	public static void main(String[] args)  throws Exception
	{
		//Take a word
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter a word ");
		        String x=sc.nextLine();
		        //Launch site
		        System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		        ChromeDriver driver=new ChromeDriver();
		        driver.get("https://www.google.com/");
		        driver.manage().window().maximize();
		        Thread.sleep(5000);
		        //search word 
		        driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
		        //count no. of results pages
		        int count=1;
		        while(2>1)// infinte loop
		        {
		        	try
		        	{
		        		if(driver.findElement(By.xpath("//*[text()='Next']")).isDisplayed())
		        		{
		        			driver.findElement(By.xpath("//*[text()='Next']")).click();
		        			count=count+1;
		        		}
		        	}
		        	catch(Exception ex)
		        	{
		        		break; //to terminate from loop
		        		
		        	}
		        }
		        //output
		        System.out.println("No. of result pages "+count);
		        driver.close();	        
	}
}
