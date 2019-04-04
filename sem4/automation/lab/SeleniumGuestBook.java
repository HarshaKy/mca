package lab;
import lab.Keys;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumGuestBook {

	public static void main(String[] args) {
		
		System.setProperty(Keys.key, Keys.value);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.seleniummaster.com/seleniumguestbook/Guestbook.aspx");
		
		WebElement name = driver.findElement(By.id("nameTextBox"));
        WebElement email = driver.findElement(By.id("emailTextBox"));
        WebElement message = driver.findElement(By.id("messageTextBox"));
        WebElement button = driver.findElement(By.id("submitButton"));
        
        name.sendKeys("Harsha Ky");
        email.sendKeys("harsha@gmail.com");
        message.sendKeys("Hello World!");
        button.click();
		
//		System.out.println(Keys.key + Keys.value);
		
		
	}

}
