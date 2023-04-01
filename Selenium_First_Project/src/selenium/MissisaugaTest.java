package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MissisaugaTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.mississauga.ca/");
		
		driver.findElement(By.xpath("//ul[@class='main-nav-links']//li[3]/button")).click();
		Thread.sleep(3000);
		
		List<WebElement> optionsList = driver.findElements(By.xpath("//ul[@class='main-nav-links']//li[3]"));		//"//ul[@class='main-nav-links']/li[3]/li"
		
		System.out.println(optionsList.size());
		
		for(int i =0; i < optionsList.size();i++)
		{
			System.out.println(optionsList.get(i).getText());
		}
	}

}
