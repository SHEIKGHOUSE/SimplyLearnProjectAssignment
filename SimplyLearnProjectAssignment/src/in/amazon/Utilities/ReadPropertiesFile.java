/**
 * 
 */
package in.amazon.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author Sheik
 *
 */
public class ReadPropertiesFile 
{

	public static String getDataFromProperties(String fileName, String key)
	{
		String data = null;
		try
		{
			File f = new File("./config-data/" + fileName + ".properties");
			FileInputStream fis = new FileInputStream(f);
			Properties p = new Properties();
			p.load(fis);
			data = p.get(key).toString();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return data;
	}
}
