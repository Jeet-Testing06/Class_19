// Assertions  -- Hard and Soft

package data_Driven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ClassD {

	public static void main(String[] args) {
		
		String expected_url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String actual_url = driver.getCurrentUrl();
		System.out.println(actual_url);
		
		Assert.assertEquals(actual_url, expected_url);  // If it matches, only then control will go further else not
		// Hard Assertions
		
		System.out.println("Matches");
		
		
		driver.close();
	}
	
}