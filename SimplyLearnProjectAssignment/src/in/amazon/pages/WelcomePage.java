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
public class WelcomePage 
{
	WebDriver dirver;
	public WelcomePage(WebDriver dirver) {
		super();
		this.dirver = dirver;
	}

	
	@FindBy(xpath="//span[contains(text(),'Hello. Sign in')]")
	WebElement Signin;
	
	public void Signin()
	{
		Signin.click();
	}
}
