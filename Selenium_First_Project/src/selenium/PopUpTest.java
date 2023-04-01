package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PopUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.aliexpress.com/");
		Thread.sleep(3000);
		
		List<WebElement> popup1 = driver.findElements(By.xpath("//img[@style='position: absolute; width: 36px; height: 36px; right: 5px; top: 5px; cursor: pointer;']"));
		List<WebElement> popup2 = driver.findElements(By.xpath("//img[@class='close-btn']"));
		List<WebElement> popup3 = driver.findElements(By.className("_24EHh"));
		
		
		if(popup1.size()>0)
		{
			popup1.get(0).click();
		}
		
		if(popup2.size()>0)
		{
			popup2.get(0).click();
		}
		
		if(popup3.size()>0)
		{
			popup3.get(0).click();
		}
		//If no pop up --> search computer
		
		driver.findElement(By.id("search-key")).sendKeys("computer");
	}

}
