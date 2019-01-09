package package1;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;

public class Test4 {

	public static void main(String[] args) {

		OperaOptions o=new OperaOptions();
		o.setBinary("C:\\Program Files\\Opera\\54.0.2952.41\\opera.exe");

				System.setProperty("webdriver.opera.driver","E:\\SDET\\operadriver_win64\\operadriver.exe");
				OperaDriver driver=new OperaDriver(o);
				driver.get("http://www.facebook.com");
		driver.close();
		
	}

}
