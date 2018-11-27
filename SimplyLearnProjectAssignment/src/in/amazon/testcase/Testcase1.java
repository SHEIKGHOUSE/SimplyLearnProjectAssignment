/**
 * 
 */
package in.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.amazon.config.TestConfiguration;
import in.amazon.pages.WelcomePage;

/**
 * @author Sheik
 *
 *This test case is for Loging into amazon website with valid credentails
 */
public class Testcase1 
{
	
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() 
	  {
		     driver = TestConfiguration.getDriverInstance();
		  
	  }	
	@Test
	public void tc1()
	{
		WelcomePage wps=PageFactory.initElements(driver, WelcomePage.class);
		wps.Signin();
	}
	
	
	
	
}
