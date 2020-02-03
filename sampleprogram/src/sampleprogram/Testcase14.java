package sampleprogram;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase14 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String cwindow = driver.getWindowHandle();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.xpath("//tr//tr[1]//td[2]//table[1]//tbody[1]//tr[1]//td[4]//a[1]//img[1]")).click();
		Set<String> s1 = driver.getWindowHandles();
		for (String s : s1) 
		{
			driver.switchTo().window(s);
			if (driver.getTitle().contains("calendar")) 
			{
				//driver.findElement(By.xpath("//td[@class='calendarCurrentDay']")).click();
				driver.findElement(By.xpath("//span[text() = '4']")).click();
				break;
				
			}
			
		}
		driver.switchTo().window(cwindow);
		driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		
		

	}

}
