package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CreateUserPage 
{
	WebDriver driver;
	public CreateUserPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

}
