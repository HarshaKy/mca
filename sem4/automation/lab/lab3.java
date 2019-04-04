package lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab3 {

	public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "/home/harsha/Desktop/college/sem4/workshop/chromedriver";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.id("username")).sendKeys("trainee");
		driver.findElement(By.name("pwd")).sendKeys("trainee");
		driver.findElement(By.id("loginButton")).click();
//		Thread.sleep(1000);
//		driver.close();

	}

}