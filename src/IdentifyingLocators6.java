

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingLocators6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         String os = System.getProperty("os.name").toLowerCase();
		
		//ChromeDriver Driver = new ChromeDriver();  // Create a ChromeDriver object of class type Chrome Driver
		
		// The object Chrome Driver object will need to implement method from the WebDriver class interface
		WebDriver driver = new ChromeDriver();
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dire")+ "/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
		}
         
		driver.get("http://www.facebook.com");  //Hit the URL on the browser
		
		driver.findElement(By.id("email")).sendKeys("This is my first code"); // To find the email field with ID attribute
	    driver.findElement(By.name("pass")).sendKeys("12345678"); //To identify password field with name attribute
	    driver.findElement(By.linkText("forgot account?")).click(); //To identify forgot password link with LinkText attribute
		
	    
	    
	}

}
