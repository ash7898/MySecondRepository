package reportsGeneration;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;


public class ReportGenerationUsingLog4jOnReport
{
	@Test
	public void test2() throws IOException
	{
		Layout lay = new PatternLayout("%d %c %m %n");
		//%d = Date, %c = Class, %m = Message, %n = New Line
		Appender append = new FileAppender(lay,"./reports/R2.log");
		//./reports/R2.log = Location/Address
		BasicConfigurator.configure(append);
		Logger log1 = Logger.getLogger(this.getClass().getName());
		log1.warn("tc warning");
		log1.error("error in testcase");
		log1.info("testcase info");
	}
}
