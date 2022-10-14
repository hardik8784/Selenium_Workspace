package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSuggestionListTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.google.ca/");
		
		//Canada in Search
		//driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("Canada");
		driver.findElement(By.name("q")).sendKeys("Canada");
		Thread.sleep(3000);
		
		//List<WebElement> options = driver.findElements(By.xpath("//div[@class='mkHrUc']//li"));
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println(options.size()); //Size - 10
		
		
		for(int i =0 ; i < options.size() ; i++)
		{
			System.out.println(options.get(i).getText());  //Text
		}
		

	}

}
