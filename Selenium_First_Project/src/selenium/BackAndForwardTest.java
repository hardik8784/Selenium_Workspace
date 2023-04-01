package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackAndForwardTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://www.google.ca/");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		
		driver.findElement(By.linkText("About")).click();
		//driver.findElement(By.partialLinkText("Abo")).click();
		
		//Thread.sleep(3000);
		wait.until(ExpectedConditions.titleContains("About Google"));
		//wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.titleIs("Google"));
		wait.until(ExpectedConditions.titleContains("Google"));
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		//Thread.sleep(3000);
		//wait.until(ExpectedConditions.titleIs("Google - About Google, Our Culture & Company News"));
		wait.until(ExpectedConditions.titleContains("About Google"));
		System.out.println(driver.getTitle());
	}

}
