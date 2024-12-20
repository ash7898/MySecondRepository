package headless;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Headless 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		FirefoxOptions opt = new FirefoxOptions();
		opt.addArguments("--headless");
		WebDriver driver = new FirefoxDriver(opt);
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("Pass")).sendKeys("abcdef");
	}
}
