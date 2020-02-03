package frameWork;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateCustomerTest extends BaseClass
{
	CreateCustomerPage CreateCustomerPage;
	LoginPage loginpage;
	CreateUserPage CreateUserPage;
	
	@BeforeMethod
	public void clickonProjectsandCustomer()
	{	
		 loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		 CreateCustomerPage =loginpage.loginToActiTime("admin", "manager");
	}
	
	@Test
	public void createcustomer()
	{
		CreateUserPage = CreateCustomerPage.createCustomer("belwin", "ramesh");
		
		
	}
	
	
	@AfterMethod
	public void retriveSucessMessage()
	{
		String s1=CreateCustomerPage.retrivemsg.getText();
		System.out.println(s1);
	    
		driver.close();
		
	
	
	}
	}
