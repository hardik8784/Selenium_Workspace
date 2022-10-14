package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookSignUpTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		
		//Click on create a new account
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.name("firstname")).sendKeys("gaedwfdcca");
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys("gadfadasdasfgr");
		//Enter 10 digit mobile number
		driver.findElement(By.name("reg_email__")).sendKeys("1010101010");
		//enter password
		driver.findElement(By.id("password_step_input")).sendKeys("dasqwAsFAGWRG$!");
		//Click on Signup
		driver.findElement(By.name("websubmit")).click();
	}

}
