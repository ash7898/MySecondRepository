package PageObjectModelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript2
{
	@FindBy(id="email")
	private WebElement uName;
	public POMScript2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passData(String UN)
	{
		uName.sendKeys(UN);
	}
}