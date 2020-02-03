package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase12 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/mercurywelcome.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//register
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("satish");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("sathya");
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("959853959");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("satish@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("h.no-12/2,xyz colony");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("hyderabad");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Telangana");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("507008");
		WebElement s = driver.findElement(By.xpath("//select[@name='country']"));
		Select s1 = new Select(s);
		s1.selectByVisibleText("INDIA");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("satishs");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("satish");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("satish");
		driver.findElement(By.xpath("//input[@name='register']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'sign-in')]")).click();
		//sign in
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("satish satya");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("satish");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		//flight details
		//WebElement p = driver.findElement(By.xpath("//select[@name='passCount']"));
		//Select s2 = new Select(p);
		//s2.selectByIndex(1);
		WebElement p1 = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select s3 = new Select(p1);
		s3.selectByVisibleText("san Francisco");
		//
		WebElement p2 = driver.findElement(By.xpath("//select[@name='fromMonth']"));
		Select s4 = new Select(p2);
		s4.selectByVisibleText("November");
		//
		WebElement p3 = driver.findElement(By.xpath("//select[@name='fromDay']"));
		Select s5 = new Select(p3);
		s5.selectByValue("27");
		

	}

}
