package package1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test31 {

	public static void main(String[] args) throws Exception 
	{
        // Launch site
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.co.in");
		Thread.sleep(5000);
		// get screen shot
		File src=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\SDET\\Taken Screen shots\\Google Screen.png");
		FileUtils.copyFile(src, dest);
		Thread.sleep(5000);
		driver.close();
		
	}

}
