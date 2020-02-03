package testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class Baseclass
{
	WebDriver  driver;
	@BeforeTest
	public void openBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		 driver = new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	
	
	@BeforeClass
	public void loginBrowser()
	{
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
	}
	
	
	@AfterClass
	public void LogoutBrowser()
	{
		driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
	
}
