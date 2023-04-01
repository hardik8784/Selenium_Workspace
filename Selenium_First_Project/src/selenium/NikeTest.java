package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NikeTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.nike.com/ca/");
		
		WebElement men = driver.findElement(By.linkText("Men"));
		Actions builder = new Actions(driver);
		builder.moveToElement(men).build().perform();
		
		Thread.sleep(3000);
		
		List<WebElement> shoesList = driver.findElements(By.xpath("(//div[@class='pre-menu-column pt4-sm ta-sm-l va-sm-t ncss-col-sm-2'])[7]//a"));
		
		System.out.println(shoesList.size());
		
		for(int i =0; i < shoesList.size();i++)
		{
			System.out.println(shoesList.get(i).getText());
		}
	}

}
