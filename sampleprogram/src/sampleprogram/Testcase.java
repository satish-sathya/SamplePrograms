package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/satish%20sathya/Desktop/test1.html");
		driver.findElement(By.id("text1")).sendKeys("qspiders");
		driver.findElement(By.id("text2")).sendKeys("jspiders");
		driver.findElement(By.id("text3")).sendKeys("99228842");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("sw")).click();
		driver.findElement(By.className("male")).click();	
		driver.findElement(By.linkText("Acti")).click();
		
	}

}
