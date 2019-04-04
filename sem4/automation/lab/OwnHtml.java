package lab;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import lab.Keys;

public class OwnHtml {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty(Keys.key, Keys.value);
		
		WebDriver driver = new ChromeDriver();

		driver.get("file:///home/harsha/Desktop/eclipse/automation/src/lab/own.html");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("nameTextBox"));
        WebElement userid = driver.findElement(By.id("useridTextBox"));
        WebElement acc = driver.findElement(By.id("accTextBox"));
        
        username.sendKeys("Harsha Ky");
        userid.sendKeys("PES1201801839");
        acc.sendKeys("123456");
		
	}

}
