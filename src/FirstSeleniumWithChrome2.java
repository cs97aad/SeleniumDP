

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSeleniumWithChrome2 {

	public static void main(String[] args)  {
		
		// TODO Auto-generated method stub
		
		WebDriver Driver = new ChromeDriver();
		
		Driver.get("http://www.google.com");
		
		//Driver.findElement(By.name("g")).sendKeys("download selenium");
		
		//Thread.sleep(5000);
		
		//Driver.findElement(By.name("btnk")).click();

	}

}
