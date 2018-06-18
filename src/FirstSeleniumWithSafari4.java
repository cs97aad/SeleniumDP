

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class FirstSeleniumWithSafari4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver Driver = new SafariDriver();
		
		Driver.get("http://www.google.com");
		
		Driver.findElement(By.name("g")).sendKeys("download selenium");
		
		//To delay for 2 seconds
		Thread.sleep(2000);
		
		Driver.findElement(By.name("btnk")).click();
		
		
	}

}
