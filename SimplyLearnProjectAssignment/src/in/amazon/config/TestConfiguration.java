/**
 * 
 */
package in.amazon.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import in.amazon.Utilities.ReadPropertiesFile;

/**
 * @author Sheik
 *
 */
public class TestConfiguration 
{

	public static WebDriver getDriverInstance()
	{
		WebDriver driver = null;
		String browser = ReadPropertiesFile.getDataFromProperties("configuration", "browser");
		String url = ReadPropertiesFile.getDataFromProperties("configuration", "url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", 
					"./browserdrivers/chromedriver.exe");
			driver = new  ChromeDriver();
			driver.get(url);
		} 
		
		return driver;
	}
}
