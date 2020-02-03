package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazontest 
{
	public WebDriver driver;
	
	@BeforeTest
	public void OpenBrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("before test executing");
	}
	
	@BeforeClass
	public void LoginBrowser()
	{
		
		System.out.println("before class executing");
	}
	
	
	@Test
	public void TestSelectProduct()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("men shirts");
		driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		driver.findElement(By.xpath("//span[@class='celwidget slot=SEARCH_RESULTS template=SEARCH_RESULTS widgetId=search-results index=1']//img[@class='s-image']")).click();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		String pname= driver.findElement(By.xpath("//span[@id='productTitle']")).getText();
		System.out.println(pname);
		Actions action =new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//input[@id='add-to-cart-button']"))).click().build().perform();
		String pmsg= driver.findElement(By.xpath("//h1[@class='a-size-medium a-text-bold']")).getText();
		System.out.println(pmsg);
		ArrayList<String> b = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(0));
		
		System.out.println("test executing");
	}
	
	@AfterClass
	public void LogoutBrowser()
	{
		System.out.println("After class executing");
	}
	
	@AfterTest
	public void CloseBrowser() throws InterruptedException
	{
		System.out.println("After test executing");
		Thread.sleep(10000);
		driver.quit();
	}

}
