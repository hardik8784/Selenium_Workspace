package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecuterClassTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en");
		
		//Thread.sleep(15000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement careers = driver.findElement(By.linkText("Careers"));
		
		//Option 1 - using (x,y) coordinate
		//System.out.println(careers.getLocation());
		//jse.executeScript("window.scrollBy(0,5000)");
		//	careers.click();
		
		//Option 2 - Scroll until the element is in view
		//jse.executeScript("arguments[0].scrollIntoView(true)", careers);
		//	careers.click();
		
		//Option 3 - Direct click 
		jse.executeScript("arguments[0].click();", careers);
		
	
	}

}
