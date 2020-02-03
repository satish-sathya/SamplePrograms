package sampleprogram;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Testcase8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Reports")).click();
		WebElement w1 = driver.findElement(By.name("users"));
		Select s1 = new Select(w1);
		int i = s1.getOptions().size();
		System.out.println(i);
		boolean t=s1.isMultiple();
		if(t)
		{
			System.out.println("multiselect");
		}
		else
		{
			System.out.println("single select");
		}
		for (int j = 0; j < i; j++) 
		{
			s1.selectByIndex(j);
			
		}
		s1.deselectAll();
		for (int j = i-1; j >=0; j--) 
		{
			s1.selectByIndex(j);
			
		}
		List<WebElement> a1 = s1.getOptions();
		for (int j = 0; j < a1.size(); j++) 
		{
			String s =a1.get(j).getText();
			System.out.println(s);
			
			
		}
		
		

	}

}
