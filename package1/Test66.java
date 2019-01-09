package package1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import org.openqa.selenium.support.ui.SystemClock;

public class Test66 
{

	private static final String String = null;
	private static final DataFlavor DataFlavor = null;
	private static final String StringFlavor = null;

	public static void main(String[] args) throws Exception
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter input 1");
     String x=sc.nextLine();
     System.out.println("Enter input 2");
     String y=sc.nextLine();
     //Launch calculator
     Runtime.getRuntime().exec("calc.exe");
     Thread.sleep(4000);
     //send output 1 to calculator window
     StringSelection sx=new StringSelection(x);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sx,null);
     Robot r=new Robot();
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(4000);
     //perform addition
     r.keyPress(KeyEvent.VK_ADD);
     r.keyRelease(KeyEvent.VK_ADD);
   //send output 2 to calculator window
     StringSelection sy=new StringSelection(y);
     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sy,null);
     r.keyPress(KeyEvent.VK_CONTROL);
     r.keyPress(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_V);
     r.keyRelease(KeyEvent.VK_CONTROL);
     Thread.sleep(4000);
     //perform =
     r.keyPress(KeyEvent.VK_EQUALS);
     r.keyRelease(KeyEvent.VK_EQUALS);
     // get output (Right click)
     r.keyPress(KeyEvent.VK_CONTEXT_MENU);
     r.keyRelease(KeyEvent.VK_CONTEXT_MENU);
     Thread.sleep(4000);
     r.keyPress(KeyEvent.VK_DOWN);
     r.keyRelease(KeyEvent.VK_DOWN);
     Thread.sleep(4000);
     r.keyPress(KeyEvent.VK_ENTER);
     r.keyRelease(KeyEvent.VK_ENTER);
     Thread.sleep(4000); 
	 String z=(String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
     System.out.println(z);
     //close site
     r.keyPress(KeyEvent.VK_ALT);
     r.keyPress(KeyEvent.VK_F4);
     r.keyRelease(KeyEvent.VK_ALT);
     r.keyRelease(KeyEvent.VK_F4);
     
     //
     r.keyPress(KeyEvent.VK_ALT);
     r.keyPress(KeyEvent.VK_F4);
     r.keyRelease(KeyEvent.VK_ALT);
     r.keyRelease(KeyEvent.VK_F4);
     //
     
     
     
    	
	}
}
