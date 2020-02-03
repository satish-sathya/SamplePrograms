package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase9 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.linkText("satish")).click();
		driver.findElement(By.xpath("//tr[3]//td[3]//table[1]//tbody[1]//tr[1]//td[1]//input[1]")).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//tr[1]//td[3]//table[1]//tbody[1]//tr[1]//td[1]//input[1]")).click();
		String s = driver.switchTo().alert().getText();
		System.out.println(s);
		driver.switchTo().alert().accept();
		String s1 = driver.findElement(By.className("successmsg")).getText();
		System.out.println(s1);

	}

}
