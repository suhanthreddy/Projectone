package package1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {

	public static void main(String[] args) throws Exception 
	{

		
		//Launch site
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://goindigo.in");
		Thread.sleep(5000);
	    //maximize
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//get width and height
		int w=driver.manage().window().getSize().getWidth();
		int h=driver.manage().window().getSize().getHeight();
		System.out.println(w+"    "+h);
		//change size
		Dimension d=new Dimension(600,300);
		driver.manage().window().setSize(d);
		Thread.sleep(5000);
		//get position
		int x=driver.manage().window().getPosition().getX();
		int y=driver.manage().window().getPosition().getY();
		System.out.println(x+"   "+y);
		//change position
		Point p=new Point(400,400);
		driver.manage().window().setPosition(p);
		Thread.sleep(5000);
		//close site
		driver.close();
		
		
		
		
		
		
			
	
	
	
	}
	

}
