package testNGSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class GenericTask29112024
{		
		public WebDriver driver;
		@BeforeClass
		public void task()
		{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		}
	@BeforeMethod
	public void task1() throws InterruptedException
	{
		driver.findElement(By.id("email")).sendKeys("91485515064");	
		Thread.sleep(1500);
		driver.findElement(By.id("pass")).sendKeys("abcdefght");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//button[.='Log in']")).click();
		Thread.sleep(1500);
	}
	@AfterMethod
	public void CloseTheBrowser()
	{
		driver.close();
	}
}
