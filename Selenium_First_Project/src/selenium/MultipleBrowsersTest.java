package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MultipleBrowsersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Read from properties file
		String browser = "Chrome"; //Chrome, Safari //If we read the browser 
		WebDriver driver;
		if(browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
		else if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.safari.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\safaridriver.exe");
			 driver = new SafariDriver();
		}
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("fafasfadgdhfvzxcassdadfassa");		//Enter wrong Id
		driver.findElement(By.id("pass")).sendKeys("gasdadasdadacasfadadasdas");		//Enter wrong pw
		driver.findElement(By.name("login")).click();
	}

}
