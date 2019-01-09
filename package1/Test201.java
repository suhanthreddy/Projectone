package package1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Test201
{

	public static void main(String[] args) throws Exception
	{
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter data to write in Notepad");
	     String x=sc.nextLine();
	     //Launch notepad
	     Runtime.getRuntime().exec("Notepad.exe");
	     Thread.sleep(4000);
	     StringSelection ss=new StringSelection(x);
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
	     Robot r=new Robot();
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     Thread.sleep(4000);
	     //click save in file menu
	     r.keyPress(KeyEvent.VK_ALT);
	     r.keyPress(KeyEvent.VK_F);
	     r.keyRelease(KeyEvent.VK_F);
	     r.keyRelease(KeyEvent.VK_ALT);
	     for (int i=1;i<=2;i++)
	     {
		     Thread.sleep(2000);
	    	 r.keyPress(KeyEvent.VK_DOWN);
		     r.keyRelease(KeyEvent.VK_DOWN);
		     Thread.sleep(2000);
	     }
	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     Thread.sleep(3000);

	     //Enter file path and save in clipboard
	     StringSelection s=new StringSelection("E:\\Manual Testing notes\\Assignment ");
	     Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	     //click save
	     Thread.sleep(2000);
	     r.keyPress(KeyEvent.VK_CONTROL);
	     r.keyPress(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_V);
	     r.keyRelease(KeyEvent.VK_CONTROL);
	     Thread.sleep(2000);

	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);
	     //close notepad
	     Thread.sleep(3000);
	     r.keyPress(KeyEvent.VK_ALT);
	     r.keyPress(KeyEvent.VK_F4);
	     r.keyRelease(KeyEvent.VK_F4);
	     r.keyRelease(KeyEvent.VK_ALT);
	     //shut down computer
	     Thread.sleep(3000);
	     r.keyPress(KeyEvent.VK_WINDOWS);
	     r.keyRelease(KeyEvent.VK_WINDOWS);
	     Thread.sleep(1000);
	     r.keyPress(KeyEvent.VK_RIGHT);
	     r.keyRelease(KeyEvent.VK_RIGHT);
	     r.keyPress(KeyEvent.VK_RIGHT);
	     r.keyRelease(KeyEvent.VK_RIGHT);
	     for (int i=1;i<=5;i++)
	     {
		     Thread.sleep(1000);
	    	 r.keyPress(KeyEvent.VK_UP);
		     r.keyRelease(KeyEvent.VK_UP);
		     Thread.sleep(2000);
	     }

	     r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);	
	}

}
