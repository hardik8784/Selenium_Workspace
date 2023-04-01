package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
		
		//ClassName objName = new ClassName();
		//FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.ca/");
		
		WebElement electronics = driver.findElement(By.linkText("Electronics"));
		Actions builder = new Actions(driver);
		builder.moveToElement(electronics).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> top_Categories = driver.findElements(By.xpath("(//nav[@aria-label='Top Categories']/ul)[3]/li"));
		
		System.out.println(top_Categories.size());
		
		for(int i =0; i < top_Categories.size();i++)
		{
			System.out.println(top_Categories.get(i).getText());
		}
	}
}
