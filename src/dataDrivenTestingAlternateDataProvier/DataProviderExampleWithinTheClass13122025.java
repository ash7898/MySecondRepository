package dataDrivenTestingAlternateDataProvier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExampleWithinTheClass13122025
{
	@Test(dataProvider = "testdata")
	public void launch(String un, String pwd) 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys(un);
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys(pwd);
		driver.findElement(By.name("login")).click();
		driver.close();
	}
	@DataProvider(name = "testdata")
	public Object[][] createData1()
	{
		return new Object[][] { { "ashrith@gmail.com", "123" }, { "dinesh@gmail.com", "456" }, { "rajesh@gmail.com", "789" },
	};
	}
}
