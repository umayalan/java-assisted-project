package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class locators {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		
		
		//3.xpath
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("umayal11012001@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		//4.cssSelector
		driver.findElement(By.cssSelector("#login-username")).sendKeys("umayal11012001@gmail.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		
		
		
		
	}

}
