package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {
	public static void main (String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		//1.id
		driver.get("https://login.yahoo.com/");
		WebElement username=driver.findElement(By.id("login-username"));
		username.sendKeys("umayal11012001@gmail.com");
		
		WebElement nextBtn =driver.findElement(By.id("login-signin"));
		nextBtn.click();
		
		//2.name
		driver.findElement(By.name("username")).sendKeys("umayal11012001@gmail.com");
		driver.findElement(By.name("signin")).click();
		
		//3.xpath
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("umayal11012001@gmail.com");
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		
		//4.cssSelector
		driver.findElement(By.cssSelector("#login-username")).sendKeys("umayal11012001@gmail.com");
		driver.findElement(By.cssSelector("#login-signin")).click();
		
		//5.linktext
		driver.findElement(By.linkText("Trouble signing in?")).click();
		
		
	}

}
