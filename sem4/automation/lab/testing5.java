package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class testing5 {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.google.com");
		driver.get("https://www.wikipedia.com/");
		
		String title = driver.getTitle();
		System.out.println("Title: " + title);
		
		if(title.equals("wikipedia")) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
		
		
		driver.navigate().back();
				
        driver.quit();

	}

}
