package testng;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class Amazonweb 
{
	
	public void Login()
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
		
		
		
		
	}
	
	

}
