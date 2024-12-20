package PageObjectModelRunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModelScript.POMScript1;

public class Demo1 
{
	@Test
	public void validData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		POMScript1 p = new POMScript1(driver);
		p.passData();
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		p.passData();
	}
}
