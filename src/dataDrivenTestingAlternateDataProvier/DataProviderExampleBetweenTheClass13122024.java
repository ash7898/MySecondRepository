package dataDrivenTestingAlternateDataProvier;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class DataProviderExampleBetweenTheClass13122024
{
	@Test( dataProvider = "LoginData", dataProviderClass = CustomizedDataProvider13122024.class)
	public void LoginTest(String un,String pwd) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(un);
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(1500);
		driver.findElement(By.name("login")).click();
		Thread.sleep(1500);
		driver.quit();
	}
}
