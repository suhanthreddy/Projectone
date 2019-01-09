package package1;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test62 
{

	public static void main(String[] args) throws Exception 
	{
		//  Launch site
		System.setProperty("webdriver.chrome.driver", "E://SDET//ChromeDriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
        Thread.sleep(5000);
        //Right click on download link (SWD)
        WebElement e=driver.findElement(By.linkText("Download"));
        Actions a=new Actions(driver);
        a.contextClick(e).build().perform();
        Thread.sleep(5000);
        //Automate win-menu using java robot
        Robot r=new Robot();
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_DOWN);
        r.keyRelease(KeyEvent.VK_DOWN);
        Thread.sleep(4000);
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(4000);
        Thread.sleep(4000);
        //close site(SWD)
        driver.quit();
	}

}
