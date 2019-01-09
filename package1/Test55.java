package package1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test55 
{

	public static void main(String[] args)
	{
     //Take a word from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		//Launch site
		System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://angularjs.org/");
		//explicit wait to maximize
		WebDriverWait w=new WebDriverWait(driver,10);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.manage().window().maximize();
		//implicit wait for locating elements
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Hello "+x+"!']")));
		//close site
		driver.close();
	}
}
