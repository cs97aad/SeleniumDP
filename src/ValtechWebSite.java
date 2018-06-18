import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValtechWebSite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String baseURL = "http://www.valtech.com";
		
        String os = System.getProperty("os.name").toLowerCase();

		WebDriver driver = new ChromeDriver();
		
		if (os.contains("mac")) {
			System.setProperty("webdriver.chrome.driver",  System.getProperty("user.dire")+ "/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ "\\chromedriver.exe");
		}
         
		driver.get(baseURL);  //Hit the URL on the browser
		Thread.sleep(15000);
		// 2. Search for a given string in Latest News
		driver.findElement(By.id("CybotCookiebotDialog"));
		driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();
		String confirmLatestnewstext = driver.findElement(By.className("block-header__heading")).getText();
		System.out.println(confirmLatestnewstext);
	}

}
