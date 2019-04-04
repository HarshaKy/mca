package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class Webpage {

	public static void main(String[] args) {

	 	// objects and variables instantiation
	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
	 WebDriver driver=new ChromeDriver();
	 //open browser
	 driver.manage().window().maximize();
	 driver.get("/home/student/h1.html");
	 WebElement verify=driver.findElement(By.name("nameTextBox"));
			 Select sel=new Select(verify);
	 
     
      

	}

}
