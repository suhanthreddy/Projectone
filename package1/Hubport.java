package package1;


import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hubport 
{
URL u1=new URL("http://192.168.1.2:5556/wb/hub");
DesiredCapabilities dc1=DesiredCapabilities.chrome();
WebDriver driver1=new RemoteWebDriver(u1,dc1);
driver1.navigate().to("https://www.google.com/");
Thread.sleep(4000);
driver1.quit();
	
	
	
}
