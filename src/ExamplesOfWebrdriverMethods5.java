

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExamplesOfWebrdriverMethods5 {

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
         
		driver.get("http://www.google.com");  //Hit the URL on the browser
		
		
		driver.getTitle();    // To get the title of the page
		
		System.out.println(driver.getTitle());
		
		
		driver.getCurrentUrl();   // To check if we land on valid URL
		System.out.println(driver.getTitle());
		
		//driver.getPageSource();  //To get page source		
		//System.out.println(driver.getPageSource()); // To print page source
		
		driver.get("http://yahoo.com");
		driver.navigate().back(); // Navigate back to google
		driver.navigate().forward(); // Navigate to yahoo.back
		
		driver.close(); //closes current browswer
		driver.quit();  //closes all browser opened by selenium script
		
		
		
		
		
	}

}
