package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdidasLoginTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
		//ClassName objName = new ClassName();
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://www.adidas.ca/en/account-login");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("login-email")).sendKeys("dfadfdgrbcwasdfefascdeffawas@gmail.com");
		driver.findElement(By.id("login-password")).sendKeys("gadfdcvewfcsewfsg$%");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		
		String expectedString = "Your request timed out – please retry";
		String actualString = driver.findElement(By.xpath("//div[@class='errorMessage___2gFNR gl-form-hint gl-form-hint--error']")).getText();
		
		System.out.println("Actual Error : " + actualString);
		
		if(expectedString.equals(actualString))
		{
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test fail");
		}
		
		
	}

}
