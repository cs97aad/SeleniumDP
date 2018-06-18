

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumWithFirefox3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String os = System.getProperty("os.name").toLowerCase();
		
		WebDriver Driver = new FirefoxDriver();
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dire")+ "/geckodriver");
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\geckodriver.exe");
		}
         Driver.get("http://www.google.com");
         
      // To get the title of the page
 		
 		Driver.getTitle();
 		System.out.println(Driver.getTitle());
		
	}

}
