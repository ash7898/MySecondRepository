package autoIT;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SampleProgram 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/Ashrith%20R/OneDrive/Documents/QSpiders/Selenium/UploadFile.html");
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.id("a1"));
		Thread.sleep(1500);
		Actions act = new Actions(driver);
		act.moveToElement(ele).click().perform();
		Thread.sleep(1500);
		Runtime.getRuntime().exec("C:\\Users\\Ashrith R\\OneDrive\\Documents\\QSpiders\\Selenium\\SciTESampleProgramUploadPath.exe");
	}
}
