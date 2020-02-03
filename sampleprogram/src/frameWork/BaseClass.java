package frameWork;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass 
{
	public WebDriver driver;
	static Properties prop;
	
	public BaseClass()
	{
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream("C:\\Users\\satish sathya\\workspace\\"
					+ "sampleprogram\\src\\frameWork\\config.properties");
				prop.load(ip);
			}
		catch (Exception e) 
		{
	     e.printStackTrace();
		}
		
	}
	
	@BeforeClass
	public void setup()
	{
		driver = BrowserFactory.startapplication(driver,"firefox","http://127.0.0.1/login.do");
	}
	
	@AfterClass
	public void teardown()
	{
		BrowserFactory.quitBrowser(driver);
	}

}
