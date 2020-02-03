package frameWork;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateProjectTest extends BaseClass
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
	public void createproject()
	{
	
		
	}
	

}
