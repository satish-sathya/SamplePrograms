package frameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCustomerPage 
{
	WebDriver driver;
	public CreateCustomerPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
@FindBy(xpath = "//span[@class='successmsg']") WebElement sucessmsg;
	
	@FindBy(linkText="Projects & Customers")
	WebElement clickonprojectsandcustomerlink;
	
	@FindBy(xpath="//body/div[@id='container']/form[@id='customersProjectsForm']"
			+ "/table/tbody/tr/td/table/tbody/tr/td/input[2]")
	WebElement addnewproject;
	
	@FindBy(xpath="//select[@name='customerId']")
	WebElement selectcustomer;
	
	@FindBy(xpath ="//input[@name='name']")
	WebElement enterprojectname;
	
	@FindBy(xpath ="//input[@name='createProjectSubmit']")
	WebElement clickoncreateproject;
	
	@FindBy(xpath = "//span[@class='successmsg']") WebElement retrivemsg;
	
	
	
	
	public CreateUserPage createCustomer(String Projectname,String addcustomer)
	{
		//clickonprojectsandcustomerlink.click();
		addnewproject.click();
		Select s1=new Select(selectcustomer);
		s1.selectByVisibleText(addcustomer);
		enterprojectname.sendKeys(Projectname);
		clickoncreateproject.click();
		
		return new CreateUserPage(driver);
		
	}
	
	public String sucessmsg() 
	{
		return retrivemsg.getText();
	}
	{
		
	}
	
	
	
	
	

}
