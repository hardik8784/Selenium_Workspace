package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooHeaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://ca.yahoo.com/");

		List<WebElement> HeaderLinks = driver.findElements(By.xpath("//ul[contains(@class,'_yb_pmjnl _yb_9efft')]/li"));
		
		System.out.println(HeaderLinks.size());
		
		for(int i=0; i< HeaderLinks.size();i++)
		{
			System.out.println(HeaderLinks.get(i).getText());
		}
	}

}
