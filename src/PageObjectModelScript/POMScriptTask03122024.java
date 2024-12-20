package PageObjectModelScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POMScriptTask03122024 
{
	@FindBy(xpath = "//input[@type='text']")
	private WebElement ele;
	public POMScriptTask03122024(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void passData(String Num)
	{
		ele.sendKeys(Num);
	}
}
