

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToWiki {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		String baseURL = "http://www.wikipedia.org";
		
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
		
		// 2. Search for a given string in English: 
		
		//driver.findElement(By.xpath("//*[@id=\"searchInput\"]")).sendKeys("Chelsea"); //xpath //*[@id="searchInput"]
		driver.findElement(By.cssSelector("input#searchInput")).sendKeys("Chelsea");
		driver.findElement(By.id("searchLanguage")).click(); // open the dropdown
		Select searchLanguage = new Select(driver.findElement(By.id("searchLanguage")));
		searchLanguage.selectByValue("en"); //select ENGLISH
		driver.findElement(By.xpath("//*[@id=\"search-form\"]/fieldset/button")).click(); // 
	
	
		// 3 Validate that the first heading of the search results page matches the search string (ignoring case). 
		
		boolean actualHeading = driver.findElement(By.cssSelector("#firstHeading")).getText().equalsIgnoreCase("chelsea");
		boolean expectedHeading = true;
        Assert.assertEquals(actualHeading, expectedHeading);
        System.out.println(actualHeading);
		
	
	    // 4. Verify that the search results page is has link in another language defined as a parameter
        
         boolean actualLanguage = driver.findElement(By.xpath("//*[@id=\"p-lang\"]/div/ul/li[9]/a")).getText().equalsIgnoreCase("Deutsch");
		 boolean expectedLanguage = true;
         Assert.assertEquals(actualLanguage,expectedLanguage);
         System.out.println(actualLanguage);
         
         
         //5. Navigate to the search results page in the other language. 
         
          driver.findElement(By.xpath("//*[@id=\"p-lang\"]/div/ul/li[9]/a")).click(); // Click on the Deutsch language link
	     
         //6. Validate that the search results page in the other language includes a link to the version in English. 
          
          boolean actualLanguage1 = driver.findElement(By.linkText("English")).getText().equalsIgnoreCase("English");
		  boolean expectedLanguage1 = true;
          Assert.assertEquals(actualLanguage1,expectedLanguage1);
          System.out.println(actualLanguage1);
         
	
		}
		
	}


