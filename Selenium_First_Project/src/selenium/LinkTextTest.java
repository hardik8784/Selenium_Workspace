package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkTextTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.google.ca/");
		
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("Abo")).click();
		
		Thread.sleep(3000);
		
		String expectedString = "Google - About Google, Our Culture & Company News";
		String actualString = driver.getTitle();
		
		//if(actualString.contains(expectedString)) -This will work as well.
		
		if(expectedString.equals(actualString))
		{
			System.out.println("Test Pass...!!!");
		}
		else
		{
			System.out.println("Test fail...!!!");
		}
	}

}
