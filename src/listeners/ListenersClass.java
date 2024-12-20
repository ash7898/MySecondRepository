package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersClass implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) 
	{
		System.out.println("Test Case Started");
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Test Case Passed");
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Test Case Failed");
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Test Case Skipped");
	}
}