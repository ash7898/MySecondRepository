package PageObjectModelRunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModelScript.POMScript3;

public class Demo3 
{
	@Test
	public void validData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		POMScript3 p = new POMScript3(driver);
		p.dataPass("Ash");
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		p.dataPass("Din");
	}
}
