package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirstClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fafasfadgdhfvzxcassdadfassa");		//Enter wrong Id
		driver.findElement(By.id("pass")).sendKeys("gasdadasdadacasfadadasdas");		//Enter wrong pw
		driver.findElement(By.name("login")).click();
		
	}

}
