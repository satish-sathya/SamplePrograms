package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

@Test(dataProvider="provideCredentials")
public class Login
{
	public  void ValidCredintials(String username,String password) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	      driver.get("http://127.0.0.1/login.do");
	      driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	      driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		
	}
	
	@DataProvider
	public  Object[][] provideCredentials()
	{
		return new Object[][] 
		{
			{"admin","manager"},
			{"admin","manger"},
			{"amin","manager"},
			{"12345","12345"},
		};
		
	}

}