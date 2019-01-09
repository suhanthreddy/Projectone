package package1;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Key;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test68 {

	public static void main(String[] args)  throws Exception

	
	{
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		//capture full screen shot(Sikulix)
		File f1=new File("E:\\SDET\\fullscreen.png");
		Screen s=new Screen();
		ScreenImage si1=s.capture();
		BufferedImage bi1=si1.getImage();
	    ImageIO.write(bi1,"png",f1);
	   //capture part of the screen shot as screen shot(sikuli)
	    File f2=new File("E:\\SDET\\partofthe sceen.png");
	    Region r=new Region(100,150,300,300);  //x,y,width,height
	    ScreenImage si2=s.capture(r);
	    BufferedImage bi2=si2.getImage();
	    ImageIO.write(bi2, "png", f2);
	    //close site(Sikulix)
	    s.keyDown(Key.ALT);
	    s.keyDown(Key.F4);
	    s.keyUp(Key.F4);
	    s.keyUp(Key.ALT);	
	}
}
