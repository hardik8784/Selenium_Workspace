package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonHoverTest {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.amazon.ca/");
		
		WebElement signin = driver.findElement(By.xpath("(//div[@class='layoutToolbarPadding'])//a[2]"));
		Actions builder = new Actions(driver);
		builder.moveToElement(signin).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> signInContent = driver.findElements(By.xpath("//div[@id='nav-al-wishlist']//a"));
		
		System.out.println(signInContent.size());
		
		for(int i =0; i < signInContent.size();i++)
		{
			System.out.println(signInContent.get(i).getText());
		}
	}

}
