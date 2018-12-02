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
public class YourAccount 
{
	WebDriver driver;
	public YourAccount(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(xpath="//h2[contains(text(),'Addresses')]")
	WebElement youraddress;
	
	public void youraddresssection()
	{
		youraddress.click();
	}
}
