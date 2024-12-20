package PageObjectModelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScript3 
{
	@FindBy(id="email")
	private WebElement ele;
	public POMScript3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement dataPass(String UN)
	{
		ele.sendKeys(UN);
		return ele;
	}
}
