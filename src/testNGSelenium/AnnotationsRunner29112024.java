package testNGSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationsRunner29112024 extends AnnotationsGeneric29112024
{
	@Test
	public void RunnerScript()
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9148515064");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("9148515064");
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}