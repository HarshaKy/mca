package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver;
System.setProperty("webdriver.chrome.driver",  "./drivers/chromedriver");
driver = new ChromeDriver();
        driver.get("file:///home/student/h1.html");
        
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        WebElement username = driver.findElement(By.id("username"));
        WebElement userid = driver.findElement(By.id("userid"));
        WebElement account_no = driver.findElement(By.id("account_no"));
        
        if(driver.findElements( By.id("...") ).size() != 0){
        	username.sendKeys("harshitha");
             try {
          			Thread.sleep(2000);
      		} catch (InterruptedException e) {
      			e.printStackTrace();
      		}
        }
       
        
        userid.sendKeys("harshithaanand25@gmail.com");
        
        try {
 			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        
        account_no.sendKeys("1234567890");
        
        try {
 			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        
        driver.manage().deleteAllCookies();
        driver.close();	
		

	}

}
