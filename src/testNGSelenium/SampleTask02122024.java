package testNGSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SampleTask02122024 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("email"));
		Thread.sleep(1500);
		ele.sendKeys("abcedef");
		Thread.sleep(1500);
		driver.navigate().refresh();
		Thread.sleep(1500);
		ele.sendKeys("admin"); //exception
		
	}
}
