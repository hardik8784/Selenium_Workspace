package Objects;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {

	WebDriver driver;
	
	public FacebookPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By username = By.name("email");
	By password = By.name("pass");
	By loginButton = By.name("login");
	
	public void EnterUserName() {
		driver.findElement(username).sendKeys("TestUser");
	}
	
	public void EnterPassword() {
		driver.findElement(password).sendKeys("Tester123");
	}
	
	public void VerifyLogin() {
		//driver.findElement(loginButton).click();
		String title = driver.getTitle();
		assertEquals(title,"Facebook - log in or sign up");
	}
}
