package sampleprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Testcase2 {

	@Test
	public  void  Login() 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//body/div[@id='container']/form[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr/td/input[1]")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("satish");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("kbnkdbfsbdvsjbfsjbfkjbfcsbfsnd");
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
		driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		//Thread.sleep(2000);
		driver.close();
     
	}

}
