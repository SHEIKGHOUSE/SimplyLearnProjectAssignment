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
	
	@FindBy(id="ap_password")
	static WebElement userpassword;
	
	public static void inputpassword(String pw)
	{
		userpassword.sendKeys(pw);
	}
	
	@FindBy(id="signInSubmit")
	static WebElement loginbutton;
	
	public static void loginbutton()
	{
		loginbutton.click();
	}

    @FindBy(id="continue")
	static WebElement continuebutton;
	
	public static void continuebutton()
	{
		continuebutton.click();
	}
}
