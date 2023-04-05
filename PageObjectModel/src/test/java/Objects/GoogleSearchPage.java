package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;
	
	//Constructor -- So Whenever I create an object/instance, it will automatically allocate the memory for the same.
	public GoogleSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By searchbox = By.xpath("//input[@name='q']");
	By searchbutton = By.xpath("(//input[@name='btnK'])[1]");
	//By facebookLink = By.linkText("Facebook - log in or sign up");
	By facebookLink = By.xpath("//a//h3[text()='Facebook - log in or sign up']");
	public void searchgoogle(String Searchinput)
	{
		try {
			driver.findElement(searchbox).sendKeys(Searchinput);
			Thread.sleep(4000);
			driver.findElement(searchbutton).click();
			Thread.sleep(4000);
		}catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}	
	}
	
	public void ClickFacebookLink()
	{
		try {
			driver.findElement(facebookLink).click();
			Thread.sleep(4000);
		}catch(Exception e){
			System.out.println("Exception:" + e.getMessage());
		}
	}
}
