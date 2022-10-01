package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
 
public class SeleniumWebElement {
 
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("http://www.amazon.in");
driver.manage().window().maximize();
Thread.sleep(4000);
driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Poco F1");
Thread.sleep(4000);
driver.findElement(By.className("nav-input")).click();
driver.findElement(By.linkText("ACM")).click();
driver.navigate().to("http://edureka.co/blog");
Thread.sleep(4000);
driver.navigate().back();
driver.quit();
 
}
}