package testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing15 {
public static void main(String[] args) throws InterruptedException {
		
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		driver.get("https://www.wikipedia.com/");
		Thread.sleep(1000);
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		Thread.sleep(1000);
		if(title.equals("wikipedia")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		Thread.sleep(1000);
		
		driver.navigate().back();
		Thread.sleep(1000);
        driver.quit();

	}

}
