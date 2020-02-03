package testng;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateUser extends Baseclass
{
	
	@BeforeMethod
	public void clickOnProjectuser()
	{
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.xpath("//div[@id='container']//form//table//tbody//tr//td//input")).click();
		
		
	}
	
	@Test
	public void testCreateUser()
	{
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("nanssese");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("nani");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("nanis");
		driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("nani");
		driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("nani");
		driver.findElement(By.xpath("//td[@class='formbuttonpane']//input[1]")).click();
	}
	
	@AfterMethod
	public void retriveSucessMessage()
	{
		String msg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		System.out.println(msg);
		
	}
	

}
