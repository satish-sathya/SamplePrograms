package sampleprogram;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://127.0.0.1/login.do");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		driver.findElement(By.xpath("//tr[6]//td[2]//input[1]")).click();
		String title =driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//img[@class='logoutImg']")).click();
		Thread.sleep(3000);
		driver.close();

	}

}
