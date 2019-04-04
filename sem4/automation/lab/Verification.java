package automation;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Verification {
public static void main(String[] args) {
	WebDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
	driver = new ChromeDriver();
	String URL = "https://accounts.google.com/";
	String expectedTitle = "Sign in - Google accounts";
	driver.get(URL);
	String actualTitle = driver.getTitle();
	if(actualTitle.equals(expectedTitle)) {
		System.out.println("Passed");
	} else {
		System.out.println("Failed");
		}
	driver.findElement(By.id("identifierId")).sendKeys("harshithaanand25@gmail.com");
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
	WebDriverWait wait = new WebDriverWait(driver, 20);
//	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	WebElement password = driver.findElement(By.name("password"));
	wait.until(ExpectedConditions.elementToBeClickable(password));
    password.sendKeys("harshianand$25");
	driver.findElement(By.xpath("//span[@class = 'RveJvd snByac']")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.close();
	}
}