package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EbayHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.ebay.ca/");
		
		List<WebElement> HeaderLinks = driver.findElements(By.xpath("//ul[@class = 'hl-cat-nav__container' ]/li"));
		
		System.out.println(HeaderLinks.size());
		
		for(int i =0; i < HeaderLinks.size() ; i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
		}
	}

}
