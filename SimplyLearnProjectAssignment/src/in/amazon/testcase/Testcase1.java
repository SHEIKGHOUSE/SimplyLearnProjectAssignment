/**
 * 
 */
package in.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.amazon.config.TestConfiguration;
import in.amazon.pages.SignInPage;
import in.amazon.pages.WelcomePage;

/**
 * @author Sheik
 *
 *This test case is for Loging into amazon website with valid credentials
 */
public class Testcase1 
{
	
	WebDriver driver;
	@BeforeMethod
	  public WebDriver beforeMethod() 
	  {
		     driver = TestConfiguration.getDriverInstance();
		     driver.manage().window().maximize();
		     return driver;
	  }	
	@Test
	public void tc1() throws Exception
	{
		WelcomePage wps=PageFactory.initElements(driver, WelcomePage.class);
		wps.Signin();
		PageFactory.initElements(driver, SignInPage.class);
		SignInPage.inputemailid();
		SignInPage.continuebutton();
		Thread.sleep(5000);
		SignInPage.inputpassword();
		SignInPage.loginbutton();
	}
	
}
