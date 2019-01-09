package package1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Sample6
{
  //Data members
  public ChromeDriver driver;
  //constructor method
  public Sample6()
  {
	  System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
	  driver=new ChromeDriver();  
  }
	//operational method
  public void launch(String u)
  {
	  driver.get(u);
  }
  public void close()  
  {
	  driver.close();
  }
  
  
}
