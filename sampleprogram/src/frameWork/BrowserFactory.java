package frameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	public static WebDriver startapplication(WebDriver driver,String browserName ,String appURL)
	{
		if (browserName.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", "C://Installations//chromedriver_win32/chromedriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
		} 
		else if (browserName.equals("firefox")) 
		{
			System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
			 driver = new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
		}
		else
		{
			System.out.println("We do not support this browser");

		}
		driver.get(appURL);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		return driver;	
	}
	
	public static void quitBrowser(WebDriver driver)
	{
		driver.quit();
	}

}
