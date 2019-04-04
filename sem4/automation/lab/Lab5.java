package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab5 {

	public static void main(String[] args) {
		WebDriver driver;
        
		System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        WebElement name = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement button = driver.findElement(By.id("btnLogin"));
        
        name.sendKeys("Admin");
        
        try {
     		Thread.sleep(2000);
 		} catch (InterruptedException e) {
 			e.printStackTrace();
 		}
        
        password.sendKeys("admin123");
        
        try {
 			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        button.click();
        
        try {
 			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        driver.manage().deleteAllCookies();
        driver.close();	


	}

}
