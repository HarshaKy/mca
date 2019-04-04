package lab;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountImages {

	public static void main(String[] args) throws InterruptedException {
		String key = "webdriver.chrome.driver";
		String value = "/home/harsha/Desktop/college/sem4/workshop/chromedriver";
		
		System.setProperty(key, value);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		driver.manage().window().maximize();
		
		int counter=0;
		List<WebElement> listImages=driver.findElements(By.tagName("img"));
	    System.out.println("No. of Images: "+listImages.size());
	    for(WebElement image:listImages)
	    {
	         if(image.isDisplayed())
	         {
	                counter++;
	                System.out.println(image.getAttribute("alt"));
	         }
	    }
	    System.out.println("No. of total displayable images: "+counter);
	    driver.close();

	}

}
