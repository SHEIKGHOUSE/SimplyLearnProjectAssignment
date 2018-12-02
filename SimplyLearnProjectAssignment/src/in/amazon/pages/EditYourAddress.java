/**
 * 
 */
package in.amazon.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

/**
 * @author Sheik
 *
 */
public class EditYourAddress 
{
	WebDriver driver;
	public EditYourAddress(WebDriver driver) {
		super();
		this.driver = driver;
	}

	@FindBy(id="address-ui-widgets-countryCode-dropdown-nativeId")
	 WebElement country;
	@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")
	 WebElement phonenumber;
	@FindBy(id="address-ui-widgets-enterAddressFullName")
	 WebElement fullname;
	@FindBy(id="address-ui-widgets-enterAddressPostalCode")
	 WebElement postalcode;
	@FindBy(id="address-ui-widgets-enterAddressLine1")
	 WebElement streetaddress;
	@FindBy(id="address-ui-widgets-enterAddressLine2")
	 WebElement streetaddress2;
	@FindBy(id="address-ui-widgets-landmark")
	 WebElement landmark;
	@FindBy(id="address-ui-widgets-enterAddressCity")
	 WebElement cityname;
	@FindBy(id="address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId")
	 WebElement statename;
	@FindBy(xpath="//select[@name='address-ui-widgets-addr-details-address-type']")
	 WebElement addresstype;
	@FindBy(id=".//*[@id='a-autoid-0']/span/input")
	 WebElement savechangesbutton;
	

	public void addressedit(String countryname,String editfullname,String editmobilenumber,String editpostalcode,String streetadd,String streetadd2,String landmark1,
			String cityname,String statename,String addresstype)
			
	{
		Select sct=new Select(country);
		sct.selectByVisibleText(countryname);
		 fullname.clear();
		 fullname.sendKeys(editfullname);
		 phonenumber.clear();
		 phonenumber.sendKeys(editmobilenumber);
		 postalcode.clear();
		 postalcode.sendKeys(editpostalcode);
		 streetaddress.clear();
		 streetaddress.sendKeys(streetadd);
		 streetaddress2.clear();
		 streetaddress2.sendKeys(streetadd2);
		 landmark.clear();
		 landmark.sendKeys(landmark1);
		 this.cityname.clear();
		 this.cityname.sendKeys(cityname);
		 Select staten=new Select(this.statename);
		 staten.selectByVisibleText(statename);
		 Select addrtyp=new Select(this.addresstype);
		 addrtyp.selectByVisibleText(addresstype);
		// savechangesbutton.click();
	}
	
	/*public void selectcountryname(String countryname)
	{
		Select sct=new Select(country);
		sct.selectByVisibleText(countryname);
	}
	
	public void editfullname(String editfullname)
	{
		
        fullname.sendKeys(editfullname);
	}
	
	public void editphonenumber(String editmobilenumber)
	{
		
		phonenumber.sendKeys(editmobilenumber);
	}
	public void editpostalcode(String editpostalcode)
	{
		
		postalcode.sendKeys(editpostalcode);
	}
	
	public void streetaddress(String streetadd)
	{
		
		streetaddress.sendKeys(streetadd);
	}
	
	public void streetaddress2(String streetadd2)
	{
		
		streetaddress2.sendKeys(streetadd2);
	}
	
	public void landmark(String landmark)
	{
		
		this.landmark.sendKeys(landmark);
	}
	
	public void cityname(String cityname)
	{
		
		this.cityname.sendKeys(cityname);
	}
	
	public void stateofliving(String statename)
	{
		Select sct=new Select(this.statename);
		sct.selectByVisibleText(statename);
	}
	public void addresstype(String addresstype)
	{
		Select sct=new Select(this.addresstype);
		sct.selectByVisibleText(addresstype);
	}
	public void savechangesbutton()
	{
		
		savechangesbutton.click();
	}*/
}
