package frameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateProjectPage 
{
	WebDriver driver;
	public CreateProjectPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
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
	
	public CreateUserPage  createproject(String Projectname)
	{
		clickoncreateproject.click();
		addnewproject.click();
		Select s1=new Select(selectcustomer);
		s1.selectByVisibleText("ramesh");
		enterprojectname.sendKeys(Projectname);
		clickoncreateproject.click();
		return new CreateUserPage(driver);
		
	}
	
	

}
