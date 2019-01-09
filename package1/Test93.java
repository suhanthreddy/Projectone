package package1;

import java.util.Locale;
import java.util.Scanner;

import javax.speech.Central;
import javax.speech.synthesis.Synthesizer;
import javax.speech.synthesis.SynthesizerModeDesc;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test93
{

	public static void main(String[] args) throws Exception
	{
		//Get data to be searched as voice in google site
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Text");
		String x=sc.nextLine();
		//Launch Google site & avoid browser notifications
		System.setProperty("webdriver.chrome.driver","E:\\SDET\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--use-fake-ui-for-media-stream=1");//Notifications realated to speaker and mic wont come
		ChromeDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='gsri_ok0']")));
		driver.findElement(By.xpath("//*[@id='gsri_ok0']")).click();
		Thread.sleep(2000);
		//convert given text to voice
		System.setProperty("freetts.voices", "com.sun.speech.freetts.en.us.cmu_us_kal.KevinVoiceDirectory");
		Central.registerEngineCentral("com.sun.speech.freetts.jsapi.FreeTTSEngineCentral");
		Synthesizer s=Central.createSynthesizer(new SynthesizerModeDesc(Locale.US));
		s.allocate();
		s.resume();
		s.speakPlainText(x, null);
		s.waitEngineState(Synthesizer.QUEUE_EMPTY);
		s.deallocate();
		//validate results
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='All']")));
		//close site
		driver.close();
	}
}
