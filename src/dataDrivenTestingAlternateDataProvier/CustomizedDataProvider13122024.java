package dataDrivenTestingAlternateDataProvier;

import org.testng.annotations.DataProvider;

public class CustomizedDataProvider13122024
{
	@DataProvider(name = "LoginData")
	public Object[][] getData()
	{
		Object[][] data = {{"ashrith@gmail.com","123"},{"dinesh@gmail.com","456"},{"rajesh@gmail.com","789"}};
		return data;
	}
}
