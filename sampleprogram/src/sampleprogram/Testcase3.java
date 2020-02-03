package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//div[@id='container']//form//table//tbody//tr//td//input")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("satish1");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sathya");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("rathna");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("satish");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("satish");
		//driver.findElement(By.xpath("//td[@class='formbuttonpane']//input[1]")).click();
		//String msg=driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		//System.out.println(msg);
		driver.findElement(By.xpath("//select[@name='active']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'disabled')]")).click();
		//driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		//driver.close();
		
		

	}

}
