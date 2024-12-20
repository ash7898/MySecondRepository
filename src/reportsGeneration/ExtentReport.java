package reportsGeneration;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReport 
{
	@Test
	public void test1()
	{
	ExtentReports rep = new ExtentReports("./Reports/R1.html",false);
	//created object for extent report
	ExtentTest test = rep.startTest("TestCase1");
	//testcase execution Started
	test.log(LogStatus.PASS, "test case passed");
	test.log(LogStatus.FAIL, "test case failed");
	test.log(LogStatus.SKIP, "test case skipped");
	//logged the status
	rep.endTest(test);
	//testcase execution Stopped
	rep.flush();
	//flushed
	}
}
