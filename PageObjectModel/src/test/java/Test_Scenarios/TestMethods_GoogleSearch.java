package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}

	@Test
	public void SearchOperation() throws InterruptedException {
		//Create object of a class on method level instead of Global level
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
		
		Thread.sleep(10000);	//Will remove this later, just checking the execution
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
