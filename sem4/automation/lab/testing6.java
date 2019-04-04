package automation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username: ");
		String un = sc.nextLine();
		System.out.println("Enter password: ");
		String pwd = sc.nextLine();
		
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		driver.get("https://accounts.google.com/AccountChooser/identifier?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
//		driver.findElement(By.className("h-c-header__nav-li-link")).click();
		driver.findElement(By.id("identifierId")).sendKeys(un);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		driver.findElement(By.name("input")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();

//		
//		if(title.equals("wikipedia")) {
//			System.out.println("passed");
//		}
//		else {
//			System.out.println("failed");
//		}
		
		
		driver.navigate().back();
				
        driver.quit();

	}

}
