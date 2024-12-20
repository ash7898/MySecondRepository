package PageObjectModelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript1 
{
	@FindBy(id="email")
	private WebElement uName;
	public POMScript1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passData()
	{
		uName.sendKeys("admin");
	}
}
