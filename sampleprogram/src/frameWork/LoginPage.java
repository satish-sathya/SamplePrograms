package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(name="username") WebElement uname;
	
	@FindBy(name="pwd") WebElement pswd;
	
	@FindBy(xpath="//tr[6]//td[2]//input[1]") WebElement loginbutton;
	
	@FindBy(linkText="Projects & Customers") WebElement projectslink;
	
	
	public CreateCustomerPage loginToActiTime(String usernameappliction,String passwordapplication)
	{
		
		uname.sendKeys(usernameappliction);
		pswd.sendKeys(passwordapplication);
		loginbutton.click();
		projectslink.click();
		
		return new CreateCustomerPage(driver);
		
	}

}
