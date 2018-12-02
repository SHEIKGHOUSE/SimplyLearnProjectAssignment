/**
 * 
 */
package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sheik
 *
 */
public class HomePage 
{
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	@FindBy(xpath="//span[contains(text(),'Hello')]")
	WebElement profile;
	
	
	
	public void profiletab()
	{
		profile.click();
	}
	
}
