package reportsGeneration;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class ReportGenerationUsingLog4jOnConsole
{
	@Test
	public void console()
	{
		BasicConfigurator.configure();
		Logger log1 = Logger.getLogger(this.getClass().getName());
		log1.warn("tc warning");
		log1.error("error in testcase");
		log1.info("testcase info");
	}
}
