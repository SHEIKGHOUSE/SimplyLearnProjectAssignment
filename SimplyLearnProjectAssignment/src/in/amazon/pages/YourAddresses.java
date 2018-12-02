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
public class YourAddresses 
{
	WebDriver driver;
	public YourAddresses(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id="ya-myab-address-edit-btn-0")
	WebElement addressedit;
	
	public void edityouraddress()
	{
		addressedit.click();
	}
	
}
