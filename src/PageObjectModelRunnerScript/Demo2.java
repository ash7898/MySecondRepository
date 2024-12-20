package PageObjectModelRunnerScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModelScript.POMScript2;

public class Demo2 
{
	@Test
	public void validData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		POMScript2 p = new POMScript2(driver);
		p.passData("Ash");
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		p.passData("Din");
	}
}
