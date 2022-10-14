package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YahooListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
				
				//ClassName objName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
				
				driver.get("https://ca.yahoo.com/");
				
				List<WebElement> Links =	driver.findElements(By.xpath("//div[@class='bd']//a"));
				System.out.println(Links.size());
				
				for(int i = 0; i < Links.size() ; i++)
				{
					System.out.println(Links.get(i).getText());
				}

	}

}
