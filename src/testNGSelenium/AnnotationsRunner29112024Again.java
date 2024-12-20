package testNGSelenium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AnnotationsRunner29112024Again extends AnnotationsGeneric29112024 {
	@Test
	public void RunnerScript()
	{
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("9663080984");
	    driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("9663080984");
	    driver.findElement(By.name("login")).click();
	}
}
