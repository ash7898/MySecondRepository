package dataDrivenTestingAlternateDataProvier;

import org.testng.annotations.Test;

public class DataProviderExampleToExtractDataFromClassNamedCustomizedDataProvider13122024
{
	@Test( dataProvider = "LoginData", dataProviderClass = CustomizedDataProvider13122024.class)
	public void LoginTest(String un,String pwd)
	{
		System.out.println(un+"  "+pwd);
	}
}
