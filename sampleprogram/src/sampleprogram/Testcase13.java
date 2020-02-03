package sampleprogram;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase13 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Reports")).click();
		driver.findElement(By.xpath("//tr//tr[1]//td[2]//table[1]//tbody[1]//tr[1]//td[4]//a[1]//img[1]")).click();
		ArrayList<String> a = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a.get(1));
		Thread.sleep(1000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//td[@class='calendarCurrentDay']//span[@class='calendarCurrentMonthWorkingDay'][contains(text(),'3')]")).click();
		ArrayList<String> a1 = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(a1.get(0));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		

	}

}
