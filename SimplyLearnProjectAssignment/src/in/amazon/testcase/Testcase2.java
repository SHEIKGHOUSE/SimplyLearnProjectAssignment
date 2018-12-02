/**
 * 
 */
package in.amazon.testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import in.amazon.config.TestConfiguration;
import in.amazon.pages.EditYourAddress;
import in.amazon.pages.HomePage;
import in.amazon.pages.SignInPage;
import in.amazon.pages.WelcomePage;
import in.amazon.pages.YourAccount;
import in.amazon.pages.YourAddresses;

/**
 * @author Sheik
 *Profile Editing
 */
public class Testcase2 
{
	WebDriver driver;
	@BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		     Testcase1 tc2=new Testcase1();
		    driver= tc2.beforeMethod();
		     tc2.tc1();
	  }	
	@Test
	public void tc2() throws Exception
	{
		//Thread.sleep(4000);
		HomePage hp=PageFactory.initElements(driver, HomePage.class);
		hp.profiletab();
		//Thread.sleep(4000);
		YourAccount ya=PageFactory.initElements(driver, YourAccount.class);
		ya.youraddresssection();
		YourAddresses yadd=PageFactory.initElements(driver, YourAddresses.class);
		yadd.edityouraddress();
		EditYourAddress ea=PageFactory.initElements(driver, EditYourAddress.class);
		ea.addressedit(countryname, editfullname, editmobilenumber, editpostalcode, streetadd, streetadd2, landmark1, cityname, statename, addresstype);
		
	}

	
}
