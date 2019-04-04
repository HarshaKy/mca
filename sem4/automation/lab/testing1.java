package automation;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class testing1 {

	public static void main(String[] args) {
		System.out.printf("1)enter gc for google-chrome\n2)enter ff for firefox\n");
		System.out.println("Enter the browser: ");
		Scanner sc = new Scanner(System.in);
		String browser = sc.nextLine();
		WebDriver driver = null;
		
		if(browser.equals("ff")) {
			
			String keyFirefox = "webdriver.gecko.driver";
			String valueFirefox = "./drivers/geckodriver";
			System.setProperty(keyFirefox, valueFirefox);
			
			driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
		}
		else if(browser.equals("gc")){
			String keyChrome = "webdriver.chrome.driver";
			String valueChrome = "./drivers/chromedriver";
			System.setProperty(keyChrome, valueChrome);
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		
        driver.close();

	}

}
