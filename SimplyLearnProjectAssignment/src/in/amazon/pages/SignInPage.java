/**
 * 
 */
package in.amazon.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @author Sheik
 *
 */
public class SignInPage 
{

	@FindBy(id="ap_email")
	static WebElement useremail;
	
	public static void inputemailid(String un)
	{
		useremail.sendKeys(un);
	}
	
    @FindBy(id="continue")
	static WebElement continuebutton;
	
	public static void continuebutton()
	{
		continuebutton.click();
	}
}
