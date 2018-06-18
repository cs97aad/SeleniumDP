import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 */

/**
 * @author IOdunlami
 *
 */
public class SeleniumLoadingBrowsers0 {


      

	  public static void main(String[] args) {
				// TODO Auto-generated method stub
				
			  		
				
	  String os = System.getProperty("os.name").toLowerCase(); //Determines the machine operating system
			
	  WebDriver driver = null;	
			
	  //ChromeDriver Driver = new ChromeDriver();  // Create a ChromeDriver object of class type Chrome Driver
				
			// The object Chrome Driver object will need to implement method from the WebDriver class interface
				
			//Driver path should be set before browser launch as given below.
			//System.setProperty("webdriver.chrome.driver","D:\List_of_Jar\chromedriver.exe");
			//WebDriver wd =new ChromeDriver();
			//String baseUrl = "https://www.google.com";
			//wd.get(baseUrl);
				 
		
		if (os.contains("mac")) {
				 if (driver == null) {
					 //System.setProperty("webdriver.chrome.driver", "/Users/IOdunlami/Downloads/chromedriver");
		             System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dire")+ "/chromedriver");
					 driver = new ChromeDriver();
					 }
				 else
				 {
			         //System.setProperty("webdriver.gecko.driver", "/Users/IOdunlami/Downloads/geckodriver");
			         System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dire")+ "/geckodriver");
			         driver = new FirefoxDriver();
			     }
	    }
		
		else
			
		{
			  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
		}
		    
			
			
		 driver.get("http://www.bbc.co.uk");
				 
			

		
       }

}
