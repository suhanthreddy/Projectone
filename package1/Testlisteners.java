package package1;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Testlisteners implements ITestListener

{

	public void onFinish(ITestContext arg0)
	{
		Reporter.log("Test finished");
	}

	public void onStart(ITestContext arg0) 
	{
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) 
	{
		
	}

	public void onTestFailure(ITestResult arg0) 
	{
		Reporter.log("Test failed");
	}

	public void onTestSkipped(ITestResult arg0) 
	{
		
	}

	public void onTestStart(ITestResult arg0)
	{
		Reporter.log("Testing started");
	}
	public void onTestSuccess(ITestResult arg0) 
	{
         Reporter.log("My Test passed");
	}

}
