package package1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24 {

	public static void main(String[] args)
	{// Launch site
    System.setProperty("webdriver.chrome.driver", "E:\\SDET\\chromedriver.exe");
    ChromeDriver driver=new ChromeDriver();
    driver.get("https://www.goindigo.in");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    //collect all images
    List<WebElement> l=driver.findElements(By.tagName("img"));
    System.out.println("count of images is "+l.size());
    int vi=0;
    int hi=0;
    for(int i=0;i<l.size();i++)
    {
    	if(l.get(i).isDisplayed())
    	{ 
    		vi=vi+1;
    	}
    	else
    	{
    		hi=hi+1;
    	}	
    }
    System.out.println("visible image count is"+vi);
    System.out.println("Hidden image count is"+hi);
    // close site 
	driver.close();
	}
	

}
