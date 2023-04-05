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
	
	public void searchgoogle(String Searchinput)
	{
		driver.findElement(searchbox).sendKeys(Searchinput);
		//driver.findElement(searchbox).sendKeys("facebook");
	}
}
