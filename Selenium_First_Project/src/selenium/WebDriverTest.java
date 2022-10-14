package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		//ParentClassName(interface) objName = new ClassName();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		email.sendKeys("fafasfadgdhfvzxcassdadfassa");		//Enter wrong Id
		
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("gasdadasdadacasfadadasdas");		//Enter wrong pw
		
		WebElement loginButton = driver.findElement(By.name("login"));
		loginButton.click();
	}

}
