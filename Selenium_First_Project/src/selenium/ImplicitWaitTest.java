package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ImplicitWaitTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.gecko.driver", "B:\\Hardik-Selenium\\QA\\SeleniumJars\\geckodriver.exe");
				//ClassName objName = new ClassName();
				FirefoxDriver driver = new FirefoxDriver();
				
				driver.get("https://www.facebook.com/");
				
				//Click on create a new account
				driver.findElement(By.linkText("Create new account")).click();
				//Thread.sleep(3000);													//Fix Time
				//It will always wait for the specific amount of time where we are finding the element, if we find the element then selenium will go to next line without the wait.
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));		//Max Time
				
				
				//driver.findElement(By.name("firstname")).sendKeys("gaedwfdcca");
				//Enter last name
				driver.findElement(By.name("lastname")).sendKeys("gadfadasdasfgr");
				//Enter 10 digit mobile number
				driver.findElement(By.name("reg_email__")).sendKeys("1010101010");
				//enter password
				driver.findElement(By.id("password_step_input")).sendKeys("dasqwAsFAGWRG$!");
				
				//Month-July
				WebElement month_box = driver.findElement(By.id("month"));
				Select month = new Select(month_box);
				
				month.selectByVisibleText("Jul");
				
				//Day-15
				WebElement day_box = driver.findElement(By.id("day"));
				Select day = new Select(day_box);
				day.selectByValue("15");
				
				//Year-2000
				WebElement year_box = driver.findElement(By.id("year"));
				Select year = new Select(year_box);
				
				year.selectByVisibleText("2000");
				
				
				driver.findElement(By.xpath("//input[@value='2']")).click();
				
				//Click on Signup
				driver.findElement(By.name("websubmit")).click();

	}

}
