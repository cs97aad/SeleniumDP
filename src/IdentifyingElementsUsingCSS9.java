

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyingElementsUsingCSS9 {

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
		
		driver.findElement(By.cssSelector("#email")).sendKeys("ee97aio@yahoo.co.uk"); //Find email field throug CSS
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("1234"); // Find password field through xpath
		driver.findElement(By.cssSelector("#loginbutton")).click(); //Find login button through CSS selector
		
		
		
		
	}

}
