package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementPresentTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.google.ca/");
		
		
		/*if(driver.findElement(By.linkText("About")).isDisplayed())
		{
			System.out.println("Element present");
		}
		else
		{
			System.out.println("Element not present");
		}*/
		
		List<WebElement> element = driver.findElements(By.linkText("About"));
		System.out.println(element.size());
		
		
		if(element.size()> 0)
		{
			System.out.println("element present");
		}
		else
		{
			System.out.println("element not present");
		}
	}

}
