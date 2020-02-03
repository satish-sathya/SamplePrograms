package sampleprogram;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Installations\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//body/div[@id='container']/form[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr/td/input[2]")).click();
		WebElement w1 = driver.findElement(By.xpath("//select[@name='customerId']"));
		Select s1 = new Select(w1);
		//int i =s1.getOptions().size();
		//System.out.println(i);
		boolean res=s1.isMultiple();
		if (res==true) 
		{
			System.out.println("multiselt");
			
		}
		else 
		{
			System.out.println("singleselt");
		}

	}

}
