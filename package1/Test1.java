package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
    
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeDriver driver   =   new ChromeDriver();
		driver.get("http://www.google.co.in");
		
		
		
		
		
	}

}
