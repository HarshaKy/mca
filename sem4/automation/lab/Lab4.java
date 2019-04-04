package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab4 {

	public static void main(String[] args) {
		WebDriver driver;
        
        System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://www.seleniummaster.com/seleniumguestbook/Guestbook.aspx");
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        WebElement name = driver.findElement(By.id("nameTextBox"));
        WebElement email = driver.findElement(By.id("emailTextBox"));
        WebElement message = driver.findElement(By.id("messageTextBox"));
        WebElement button = driver.findElement(By.id("submitButton"));
        
        name.sendKeys("Harshitha");
        
        try {
     			Thread.sleep(2000);
 		} catch (InterruptedException e) {
 			e.printStackTrace();
 		}
        
        email.sendKeys("harshithaanand25@gmail.com");
        
        try {
 			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        message.sendKeys("hello");
        
        try {
 			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        button.click();
        
        driver.manage().deleteAllCookies();
        driver.close();	


	}

}
