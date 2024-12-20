package PageObjectModelRunnerScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import PageObjectModelScript.POMScriptTask03122024;

public class RunnerScriptTask03122024
{
	@Test
	public void sendData() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./Softwares/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/kent-dew-humidifier-ultrasonic-mist-4l-25w-eliminates-dryness-ac-heater-portable-room-air-purifier/p/itmd4fa29924877d?pid=APFH3XMXXFYWMBNZ&lid=LSTAPFH3XMXXFYWMBNZIWPA54&marketplace=FLIPKART&store=j9e%2Fabm%2F3o4&srno=b_1_1&otracker=browse&fm=organic&iid=en_Gbu0XnR9MQ6k8Z8LgbEYBj9qWOo_E9kd2U8Gh7NXWw7EY-X1TqGYhd6zcwYJlFJ4mSpRY4ckjOPe1GrdxYEeqfUFjCTyOHoHZs-Z5_PS_w0%3D&ppt=hp&ppn=homepage&ssid=pmv73mobizz85f5s1733206010955");
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@type='text']")).click();
		POMScriptTask03122024 p = new POMScriptTask03122024(driver);
		p.passData("9148515064");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//span[.='CONTINUE']")).click();
	}
}
