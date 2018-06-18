import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingCSSRegularExpression17 {

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
         
	  driver.get("http://rediff.com");  //Hit the URL on the browser
		
	  //  //tagName[attribute* = ‘value’] -  CSS path for regular expression
	  
 	  driver.findElement(By.cssSelector("a[title*='Sign in']")).click(); //Find login button using CSS regular expression
 	  driver.findElement(By.cssSelector("input[id*='log']")).sendKeys("c97aad@yahoo.co.uk"); // Find password field through customised Hatch #id CSS
	  driver.findElement(By.cssSelector("input[type*='pas']")).sendKeys("123456");
	  driver.findElement(By.cssSelector("input[type*='sub']")).click();
	 
 	  
	  //driver.findElement(By.cssSelector("input[type*='sub']")).click(); //Find login button through customised CSS Hatch #id
	 
	  //driver.findElement(By.cssSelector("input[value='Log In']")).click()
	  // Tested and working
		
	}

}
