package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
				
				//ClassName objName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
				
				driver.get("https://www.facebook.com/");
				
				List<WebElement> facebookLinks = driver.findElements(By.xpath("//div[@id='pageFooterChildren']/ul/li"));
				//List<WebElement> facebookLinks_thirdOpttion = driver.findElements(By.xpath("//div[@id='pageFooterChildren']//li"));
				//List<WebElement> facebookLinks_secondOption = driver.findElements(By.xpath("//ul[contains(@class,'pageFooterLinkList')]/li"));
				System.out.println(facebookLinks.size());
				
				for(int i = 0 ; i < facebookLinks.size() ; i++)
				{
					System.out.println(facebookLinks.get(i).getText());
				}
	}

}
