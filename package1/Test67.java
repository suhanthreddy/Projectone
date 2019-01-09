package package1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Test67 
{


	public static void main(String[] args) throws Exception
	{
  
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("search_query")));
		driver.manage().window().maximize();
		//fill field for required video(SWD)
		driver.findElement(By.name("search_query")).sendKeys("abdul kalam speeches ");
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@aria-label='Search'])[3]/child::*[1]")));
		driver.findElement(By.xpath("(//*[@aria-label='Search'])[3]/child::*[1]")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@title,'Abdul Kalam in European Parliament')]")));
	    driver.findElement(By.xpath("//*[contains(@title,'Abdul Kalam in European Parliament')]")).click();
	    w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Abdul Kalam in European Parliament')])[3]")));
	    //Automate video elements
	    Screen s=new Screen();
	    Thread.sleep(5000);    // to get skip add in advertisement
	    if(s.exists("skip ad")!=null)
	    {
	    	s.click("skip ad.png");
	    }
	    // move mouse pointer to video body and click pause
	    Location l=new Location(300,300);
	    s.wheel(l,Button.LEFT,0);
	    s.click("pause.png");
	    Thread.sleep(4000);
	    // move mouse pointer to video body and click play
	    s.wheel(l,Button.RIGHT,0);
	    s.click("play.png");
        Thread.sleep(4000);
        //move ,mouse pointer to video body and move to volume
        s.wheel(l, Button.LEFT,0);
        s.mouseMove("volume.png");
        //automate slider from left to right to decrease volume
        Match e=s.find("bubble.png");
        int x=e.getX();
        int y=e.getY();
        Location el1=new Location(x-50,y);
        s.dragDrop(e, el1);
        Thread.sleep(4000);
        //automate slider from right to left to increase volume
        Location el2=new Location(x+50,y);
        s.dragDrop(e, el2);
        Thread.sleep(4000);
        //close site
        driver.close();
	}
}
