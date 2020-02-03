package frameWork;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Logintest extends BaseClass
{
	CreateCustomerPage CreateCustomerPage;
	LoginPage loginpage;
	
	@Test
	public void loginApp()
	{	
		loginpage = PageFactory.initElements(driver, LoginPage.class);
		
		CreateCustomerPage = loginpage.loginToActiTime("admin", "manager");
	
	}

}
