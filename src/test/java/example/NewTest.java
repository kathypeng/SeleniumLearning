package example;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewTest {
	
	private WebDriver driver;	
	
	@Test
	public void testEasy() {
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}
	
	@BeforeTest
	public void beforeTest() {
		String driverPath = "C:/chromedriver_win32/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);   	
		driver = new ChromeDriver();
		
	}

	@AfterTest
	public void afterTest() {
		driver.quit();	
		
	}

}
