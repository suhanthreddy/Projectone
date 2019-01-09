package package1;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Test3 {

	public static void main(String[] args) {

	System.setProperty("webdriver.ie.driver","E:\\SDET\\iedriverserver.exe");
	InternetExplorerDriver driver=new InternetExplorerDriver();
	driver.get("http://www.facebook.com");
	
		
		
	}

}
