package selenium;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();		//This has constructor inside which opening the Firefox
		
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-636924869%3A1665587486359833&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWqOC-t-oFO5OwDB686oK2T4AHAoMp2UqjcL6TgdiRgV5hXssKpMqnWKjyQPDypCWEoHhG_xlA");
		
		//Set<String> allwindowHandles = driver.getWindowHandles();
		//System.out.println(allwindowHandles.size());
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(3000);
		Set<String> allwindowHandles = driver.getWindowHandles();
		System.out.println(allwindowHandles.size());
		
		Iterator<String> itr = allwindowHandles.iterator();
		
		String mainWindow = itr.next();
		String childWindow = itr.next();
		
		System.out.println(mainWindow);
		System.out.println(childWindow);
		driver.switchTo().window(childWindow);
		System.out.println(driver.getTitle());		//Help page Title
		driver.close();			//Only close where we are currently
		
		driver.switchTo().window(mainWindow);
		System.out.println(driver.getTitle());		//Gmail page Title
		
		Thread.sleep(3000);
		driver.quit();			//Quit will kill everything and close the browser
	}

}
