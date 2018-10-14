//Soft Assertions

package data_Driven;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.assertions.Assertion_E;

public class ClassF {

	public static void main(String[] args) {
		
		String expected_url = "https://www.facebook.com/";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jitender.ahuja\\Downloads\\Jar Files\\chromedriver_win32\\chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String actual_url = driver.getCurrentUrl();
		System.out.println(actual_url);
		
		Assertion_E.assert1(expected_url, actual_url);
		
		driver.close();
	}
	
	
}
