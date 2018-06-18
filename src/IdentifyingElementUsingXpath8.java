

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementUsingXpath8 {

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
         
	     
		driver.get("https://login.salesforce.com");  //Hit the URL on the browser
		
		driver.findElement(By.id("username")).sendKeys("Hello"); // To find the email field with ID attribute
	    driver.findElement(By.name("pw")).sendKeys("12345678"); //To identify password field with name attribute
	    //driver.findElement(By.className("button r4 wide primary")).click(); // error will be shown as class with space are not allowed
	    driver.findElement(By.xpath("//*[@id=\'Login\']")).click(); //To identify login button using 
	    
	    
	}

}
