package sampleprogram;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mainclass {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "C://Installations//geckodriver-v0.25.0-win64/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		/*System.setProperty("webdriver.chrome.driver","C:\\Installations\\chromedriver_win32\\chromedriver.exe");
	      WebDriver driver=new ChromeDriver();*/
	      driver.get("https://gaana.com");
	      driver.navigate().forward();
	      Thread.sleep(1000);
	      driver.navigate().back();
	      Thread.sleep(1000);
	      Dimension d1 = new Dimension(500, 500);
	      driver.manage().window().setSize(d1);
	      Thread.sleep(1000);
	      driver.manage().window().maximize();
	      Thread.sleep(1000);
	      driver.close();
	}

}
