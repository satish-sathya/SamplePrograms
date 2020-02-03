 package testng;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomer extends Baseclass
{
	
	
	@BeforeMethod
	public void clickOnProjectandCustomers()
	{
		driver.findElement(By.linkText("Projects & Customers")).click();
		driver.findElement(By.xpath("//body/div[@id='container']/form[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr/td[2]/input[1]")).click();
		
		
	}
	
	@Test
	public void testCreateCustomer()
	{
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("navsssess");
		driver.findElement(By.xpath("//input[@name='createCustomerSubmit']")).click();
	}
	
	@AfterMethod
	public void retriveSucessMessage()
	{
		String msg = driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
		System.out.println(msg);
		
	}
	
	
	

}
