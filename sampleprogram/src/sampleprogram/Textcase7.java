package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Textcase7 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.xpath("//body/div[@id='container']/table/tbody/tr/td/table/tbody/tr/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//select[@name='customerId']")).click();
		driver.findElement(By.xpath("//option[contains(text(),'satish')]")).click();
		WebElement w = driver.findElement(By.xpath("//select[@name='projectId']"));
		Select s1 = new Select(w);
		s1.selectByIndex(2);
		driver.findElement(By.xpath("//input[@name='task[0].name']")).sendKeys("satsahya");
		WebElement w1 = driver.findElement(By.xpath("//select[@name='task[0].billingType']"));
		Select s2 = new Select(w1);
		s2.selectByIndex(1);
		driver.findElement(By.xpath("//td[@class='formbuttonpane']//input[1]")).click();
		String s = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		System.out.println(s);
		

		

	}

}
