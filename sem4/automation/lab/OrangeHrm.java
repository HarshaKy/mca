package lab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import lab.Keys;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Keys.key, Keys.value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement name = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        WebElement button = driver.findElement(By.id("btnLogin"));
        
        name.sendKeys("Admin");
        password.sendKeys("admin123");
        button.click();

	}

}
