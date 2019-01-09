package package1;

import java.io.File;
import java.util.Date;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test105 
{

	public static void main(String[] args)throws Exception
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word ");
        String x=sc.nextLine();
        //Launch site
        System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
        ChromeDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        //search word 
        driver.findElement(By.name("q")).sendKeys(x,Keys.ENTER);
        Thread.sleep(3000);
        //Test title
        int flag=0;
        while(2>1)//infinite loop
           {
        	String t=driver.getTitle();
        	if(!t.contains(x))
        		{
        		 flag=1;
        		 //get screen shot with date and title
        		 Date d=new Date();
        		 File src=driver.getScreenshotAs(OutputType.FILE);
        		 File dest=new File(d.toString()+".png");
        		 FileUtils.copyFile(src, dest);
        		 break;//stop loop due to test failed
        		}
        	else
        	{
        	   try
        		{
        		//go to next page
        		driver.findElement(By.xpath("//*[text()='Next']")).click();
        		Thread.sleep(3000);
        		}
        		catch(Exception ex)
        	   {
        		break;//stop loop due to test failed
        	   }
        	} // else closing
           }//while loop closing
        if(flag==0)
        {
        	System.out.println("Google title test passed");
        }
        else
        {
        	System.out.println("Goolge title test failed");
        }
		// close site
		driver.close();
	}

}
