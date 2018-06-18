

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String os = System.getProperty("os.name").toLowerCase(); //Determines the machine operating system
		
		
		
		//ChromeDriver Driver = new ChromeDriver();  // Create a ChromeDriver object of class type Chrome Driver
		
		// The object Chrome Driver object will need to implement method from the WebDriver class interface
		
		//Driver path should be set before browser launch as given below.
		 //System.setProperty("webdriver.chrome.driver","D:\List_of_Jar\chromedriver.exe");
		 //WebDriver wd =new ChromeDriver();
		 //String baseUrl = "https://www.google.com";
		 //wd.get(baseUrl);
		 
		
		
		WebDriver Driver = new ChromeDriver();
		
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dire")+ "/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
		}
         Driver.get("http://www.google.com");
		 
	}

}
