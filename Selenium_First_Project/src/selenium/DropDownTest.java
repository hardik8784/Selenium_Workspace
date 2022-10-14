package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;

public class DropDownTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
		//ClassName objName = new ClassName();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.ebay.ca/");	//This has constructor inside which opening the Firefox
		
		driver.get("https://www.ebay.ca/");
		List<WebElement> optionsList = driver.findElements(By.xpath("//select[@id='gh-cat']/option"));
		
		System.out.println(optionsList.size());
		
		/*for(int i =0; i < optionsList.size() ;i++)
		{
			System.out.println(optionsList.get(i).getText());
		}*/
		
		for(int i =0; i < optionsList.size();i++)
		{
			System.out.println(optionsList.get(i).getText() + "------------------------" + optionsList.get(i).isSelected());
		}
		
		
		/*Thread.sleep(10000);
		
		driver.findElement(By.xpath("//div[@id='close']")).click();*/
		
		WebElement options_box = driver.findElement(By.id("gh-cat"));
		Select select_option = new Select(options_box);
		
		select_option.selectByIndex(1);		//Select Antiques
		Thread.sleep(3000);
		
		select_option.selectByValue("2984");	//Select Baby
		Thread.sleep(3000);
		
		select_option.selectByVisibleText("Books");	//Select Books
	}

}
