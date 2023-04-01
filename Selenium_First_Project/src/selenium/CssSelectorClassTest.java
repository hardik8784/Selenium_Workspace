package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectorClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.cssSelector("#email")).sendKeys("fafasfadgdhfvzxcassdadfassa");		//Enter wrong Id
		driver.findElement(By.cssSelector("#pass")).sendKeys("gasdadasdadacasfadadasdas");		//Enter wrong pw
		//driver.findElement(By.cssSelector(" button[name*='login']")).click();
		driver.findElement(By.cssSelector("button[id*='u_0_5']")).click();
		
		
	}

}
