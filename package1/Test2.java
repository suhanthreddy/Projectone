package package1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Test2 {

	public static void main(String[] args) {

	    System.setProperty("webdriver.gecko.driver","E:\\SDET\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		
		
	}

}
