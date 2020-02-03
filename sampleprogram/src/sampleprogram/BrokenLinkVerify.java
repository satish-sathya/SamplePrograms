package sampleprogram;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinkVerify 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		for (int i = 0; i < links.size(); i++)
		{
			String s =links.get(i).getAttribute("href");
			verifylink(s);
			
		}
	}

	private static void verifylink(String url) throws IOException 
	{
		URL u1 = new URL(url);
		HttpURLConnection rv1 =(HttpURLConnection)u1.openConnection();
		rv1.connect();
		if(rv1.getResponseCode() == 200)
		{
			System.out.println(url=" "+rv1.getResponseMessage());
		}
		else
		{
			System.out.println(url=" "+rv1.getResponseMessage());
		}
		
		
		
	}

}
