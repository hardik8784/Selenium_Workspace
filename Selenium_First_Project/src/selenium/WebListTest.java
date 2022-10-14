package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.google.ca/");
		
		/*List<WebElement> allLink = driver.findElements(By.tagName("a"));
		System.out.println(allLink.size());
		
		
		for(int i =0; i<allLink.size();i++)
		{
			System.out.println(allLink.get(i).getText());
		}*/
		
		//------------------------------------------------------//
		
		List<WebElement> footerLink = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']"));
		System.out.println(footerLink.size());
		
	
		
		for(int i =0; i<footerLink.size();i++)
		{
			System.out.println(footerLink.get(i).getText());
		}
	}

}
