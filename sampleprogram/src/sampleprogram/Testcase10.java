package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testcase10 {

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
		driver.findElement(By.xpath("//body/div[@id='container']/form[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr/td[2]/input[1]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("mahesh");
		driver.findElement(By.linkText("Completed Tasks")).click();
		String s = driver.findElement(By.xpath("//input[@id='DiscardChangesButton']")).getAttribute("value");
		System.out.println(s);
		String s1 = driver.findElement(By.xpath("//input[@id='RemainOnThePageButton']")).getAttribute("value");
		System.out.println(s1);
		driver.findElement(By.xpath("//input[@id='DiscardChangesButton']")).click();
		
		

	}

}
