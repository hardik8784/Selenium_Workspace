package Test_Scenarios;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestMethods_GoogleSearch {
	WebDriver driver;
	GoogleSearchPage objectRepo;
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com/");
	}

	@Test(priority = 0)
	public void SearchOperation() {
		//Create object of a class on method level instead of Global level
		GoogleSearchPage page = new GoogleSearchPage(driver);
		page.searchgoogle("facebook");
	}
	
	@Test(priority = 1)
	public void VerifyAndAccessFacebook() {
		objectRepo = new GoogleSearchPage(driver);
		objectRepo.ClickFacebookLink();
	}
	
	@Test(priority = 2)
	public void VerifyLogin() {
		FacebookPage page = new FacebookPage(driver);
		page.EnterUserName();
		page.EnterPassword();
		page.VerifyLogin();
	}
	
	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}
