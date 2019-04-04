package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing3 {
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver";
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
//		driver.navigate().to("https://www.github.com");
		
		driver.navigate().to("https://www.naukri.com/");
		driver.switchTo().alert().dismiss();

		driver.navigate().back();
				
        driver.quit();	
	}
}
